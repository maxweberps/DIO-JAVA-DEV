package edu.DesafiosDeCodigo.Desafio04;

import java.util.Scanner;

public class Dragao {

    public static void main(String[] args) {
        int casos, poderDeLuta;
        Scanner ler = new Scanner(System.in);
        //qtde de casos que serão testados
        casos = ler.nextInt();

        //testes
        for(int i = 0; i<casos;i++){
            poderDeLuta = ler.nextInt();
            if (poderDeLuta<=8000)
                System.out.println("Inseto!");
            else
                System.out.println("Mais de 8000!");
        }
    }
}
