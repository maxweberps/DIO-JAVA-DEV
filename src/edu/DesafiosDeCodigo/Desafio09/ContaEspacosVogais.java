package edu.DesafiosDeCodigo.Desafio09;

import java.util.Scanner;

public class ContaEspacosVogais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[] grupoVogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String frase = ler.nextLine();
        int vogais = 0, espacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                espacos++;
            } else {
                for (int v = 0; v < grupoVogais.length; v++) {
                    if (c == grupoVogais[v])
                        vogais++;
                }

            }
        }

        System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais);

    }
}
