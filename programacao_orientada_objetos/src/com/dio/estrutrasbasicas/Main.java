package com.dio.estrutrasbasicas;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Fox");
        carro1.setCapacidadeTanque(100);

        System.out.printf("Total para encher o tanque: R$%.2f", carro1.valorEncherTanque(3.5));
    }
}
