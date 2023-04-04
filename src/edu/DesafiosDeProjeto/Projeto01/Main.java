package edu.DesafiosDeProjeto.Projeto01;

import edu.DesafiosDeProjeto.Projeto01.dominio.Conteudo;
import edu.DesafiosDeProjeto.Projeto01.dominio.Curso;
import edu.DesafiosDeProjeto.Projeto01.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //herança
        Curso curso1 = new Curso();
        curso1.setTitulo("Trabalhando em Equipes Ágeis");
        curso1.setDescricao("Descrição de Trabalhando em Equipes Ágeis");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do Tio San");
        mentoria1.setDescricao("Essa mentoria é para você que quer dominarr");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        //polimorfismo: diferentes formas de criar um objeto
        Conteudo curso2 = new Curso();
        curso2.setTitulo("Introdução ao Git e ao GitHub");
        curso2.setDescricao("Descrição de Introdução ao Git e ao GitHub");
        System.out.println(curso2);


    }
}
