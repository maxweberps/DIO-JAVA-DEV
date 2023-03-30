package edu.Testes;

import java.util.Scanner;


public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //criou array do tipo string e já inicializou incluindo os elementos
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
