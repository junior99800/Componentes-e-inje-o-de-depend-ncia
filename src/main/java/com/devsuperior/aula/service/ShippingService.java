package com.devsuperior.aula.service;


import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double pagarFrete(Order order){
        double valor = order.getValor();
        double frete;

        if (valor < 100) {
            frete = 20.0;
        } else if (valor >= 100 && valor < 200) {
            frete = 12.0;
        } else {
            frete = 0.0;
        }

        order.setFrete(frete);
        return frete;
    }
}
