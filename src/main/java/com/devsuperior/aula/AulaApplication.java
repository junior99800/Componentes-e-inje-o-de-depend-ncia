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

		Order order = new Order(3333, 199.0, 0.0);
		orderService.codigo(order);
		double total = orderService.total(order);
		System.out.println("Valor do pedido: " + order.getValor());
		System.out.println("Frete: " + order.getFrete());
		System.out.println("Total a pagar: " + total);
	}
}
