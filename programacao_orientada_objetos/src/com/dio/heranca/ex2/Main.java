package com.dio.heranca.ex2;

public class Main {
    public static void main(String[] args) {

        //Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        Gerente gerente2 = (Gerente) new Funcionario(); //DEVE SER EVITADO
    }
}
