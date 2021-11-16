package com.company;

//import Funções.CalculaIdade;

import Funções.Utils;

import static Funções.Utils.calculaIdade;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("davi", "davi@email.com", "47637813835", "28-11-1995");
        Cliente cliente2 = new Cliente("Teste", "Teste@email.com", "12345678985", "04-12-1999");

        System.out.println(cliente1.getId());
        System.out.println(cliente2.getId());
        System.out.println(cliente1.getIdade());
    }
}
