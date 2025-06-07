package com.devsuperior.aula.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int code;
    private double valor;
    private double desconto;



}
