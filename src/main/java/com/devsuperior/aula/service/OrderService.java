package com.devsuperior.aula.service;


import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public void codigo(Order order) {
        System.out.println("Pedido código: " + order.getCode());
    }


    public double total(Order order) {
        double frete = shippingService.pagarFrete(order);
        double total = order.getValor() + frete;
        return total;
    }

}

