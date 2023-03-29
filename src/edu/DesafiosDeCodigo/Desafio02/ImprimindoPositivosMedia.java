package edu.DesafiosDeCodigo.Desafio02;

import java.sql.Array;
import java.util.*;

public class ImprimindoPositivosMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] valores = new double[6];

        //leitura de dados
        for (int i = 0; i < 6; i++)
            valores[i] = leitor.nextDouble();


        //contagem e soma de numeros positivos
        int cont = 0;
        double soma = 0;
        for (int i = 0; i < 6; i++)
            if (valores[i] > -1) {
                cont++;
                soma = soma + valores[i];
            }

        System.out.println(cont + " valores positivos");

        //média de valores
        double media = 0;
        media = soma / cont;
        System.out.println(String.format("%.1f", media));
    }
}
