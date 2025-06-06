package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.Ordered;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}


	private OrderService orderService;

	public AulaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.0, 20.0);
		orderService.codigo(order1);
		orderService.total(order1);

		Order order2 = new Order(2282, 800.0, 10.0);
		orderService.codigo(order2);
		orderService.total(order2);

		Order order3 = new Order(1309, 95.90, 0.0);
		orderService.codigo(order3);
		orderService.total(order3);

	}
}
