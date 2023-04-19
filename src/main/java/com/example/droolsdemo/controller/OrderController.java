package com.example.droolsdemo.controller;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.droolsdemo.domain.Order;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

	private final KieContainer kieContainer;

	@PostMapping
	public Order processOrder(@RequestBody Order order) {
		final KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(order);
		kieSession.fireAllRules();
		kieSession.dispose();
		return order;
	}

}
