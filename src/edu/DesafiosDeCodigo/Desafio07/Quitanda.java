package edu.DesafiosDeCodigo.Desafio07;

import java.util.Scanner;

public class Quitanda {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double qtdMorango = ler.nextDouble();
        double qtdMaca = ler.nextDouble();
        double subtotal, total;


        Quitanda compra = new Quitanda();

        if ((qtdMorango + qtdMaca) > 8 || (compra.calcSubTotal(qtdMorango, qtdMaca) > 25)) {
            subtotal = compra.calcSubTotal(qtdMorango, qtdMaca);
            total = subtotal - compra.calcDesconto(subtotal);
            System.out.println(total);
        } else {
            total = compra.calcSubTotal(qtdMorango, qtdMaca);
            System.out.println(total);
        }

    }

    double calcDesconto(double subTotal) {
        double desconto = subTotal * 0.1;
        return desconto;
    }

    double calcSubTotal(double qtdMorango, double qtdMaca) {
        double subTotal = 0;

        //subtotal Morango
        if (qtdMorango <= 5) {
            subTotal = qtdMorango * 2.5;
        } else {
            subTotal = qtdMorango * 2.2;
        }

        //subtotal Maca
        if (qtdMaca <= 5) {
            subTotal = subTotal + (qtdMaca * 1.8);
        } else {
            subTotal = subTotal + (qtdMaca * 1.5);
        }

        return subTotal;
    }


}
