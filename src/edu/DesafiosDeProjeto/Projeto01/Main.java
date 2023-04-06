package edu.DesafiosDeProjeto.Projeto01;

import edu.DesafiosDeProjeto.Projeto01.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //herança
        Curso curso1 = new Curso();
        curso1.setTitulo("Trabalhando em Equipes Ágeis");
        curso1.setDescricao("Descrição de Trabalhando em Equipes Ágeis");
        curso1.setCargaHoraria(8);

        //polimorfismo: diferentes formas de criar um objeto
        Conteudo curso2 = new Curso();
        curso2.setTitulo("Introdução ao Git e ao GitHub");
        curso2.setDescricao("Descrição de Introdução ao Git e ao GitHub");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do Tio San");
        mentoria1.setDescricao("Essa mentoria é para você que quer dominarr");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java developer");
        bootcamp1.setDescricao("descrição do bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Max");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Max: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("---progrediu---");
        System.out.println("Conteúdos inscritos Max: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Max: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println( );

        Dev dev2 = new Dev();
        dev2.setNome("Paulino");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Paulino: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("---progrediu---");
        System.out.println("Conteúdos inscritos Paulino: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Paulino: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

    }

}
