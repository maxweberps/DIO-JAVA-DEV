package edu.DesafiosDeCodigo.Desafio05;

import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //ler quantidade de sequencias
        int n = leitor.nextInt();

        int proximo, anterior = 0, atual = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n) System.out.println(anterior);
            else {
                System.out.print(anterior + " ");
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }

}
