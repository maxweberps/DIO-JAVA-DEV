package edu.DesafiosDeCodigo.Desafio06;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String AN1, AN2, AN3;
        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (Objects.equals(AN1, "vertebrado")) {
            if (Objects.equals(AN2, "ave")) {
                if (Objects.equals(AN3, "carnivoro")) {
                    System.out.println("aguia");
                } else if (Objects.equals(AN3, "onivoro")) {
                    System.out.println("pomba");
                }
            } else if (Objects.equals(AN2, "mamifero")) {
                if (Objects.equals(AN3, "onivoro")) {
                    System.out.println("homem");
                } else if (Objects.equals(AN3, "herbivoro")) {
                    System.out.println("vaca");
                }

            }
        } else if (Objects.equals(AN1, "invertebrado")) {
            if (Objects.equals(AN2, "inseto")) {
                if (Objects.equals(AN3, "hematofago")) {
                    System.out.println("pulga");
                } else if (Objects.equals(AN3, "herbivoro")) {
                    System.out.println("lagarta");
                }

            } else if (Objects.equals(AN2, "anelideo")) {
                if (Objects.equals(AN3, "hematofago")) {
                    System.out.println("sanguessuga");
                } else if (Objects.equals(AN3, "onivoro")) {
                    System.out.println("minhoca");
                }

            }
        }
        {

        }
    }
}
