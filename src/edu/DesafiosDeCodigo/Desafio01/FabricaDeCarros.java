package edu.DesafiosDeCodigo.Desafio01;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int percentualDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        int custoImpostos;
        custoImpostos = (custoFabrica * percentualImpostos) / 100;
        int custoDistribuidor;
        custoDistribuidor = (custoFabrica * percentualDistribuidor) / 100;

        System.out.println("Custo do carro novo: "+(custoFabrica + custoImpostos + custoDistribuidor));


    }
}