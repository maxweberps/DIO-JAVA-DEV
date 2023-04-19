package edu.DesafiosDeCodigo.Desafio08;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double lado1 = ler.nextDouble();
        double lado2 = ler.nextDouble();
        double lado3 = ler.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Perimetro = " + (lado1+lado2+lado3));
        } else {
            System.out.println("Area = "+ ((lado1+lado2)*lado3)/2);
        }
    }
}
