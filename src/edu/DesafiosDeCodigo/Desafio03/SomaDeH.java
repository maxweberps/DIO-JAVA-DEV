package edu.DesafiosDeCodigo.Desafio03;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class SomaDeH {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();


        for (float i = 1; i <= n; i++) {
            if (i == 1) {
                h = 1;
            } else
                h = (h + (1 / i));
        }


        System.out.println(String.format("%.0f",h));
    }
}
