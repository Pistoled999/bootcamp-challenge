package bootcamp;

import bootcamp.domain.Bootcamp;
import bootcamp.domain.Curso;
import bootcamp.domain.Dev;
import bootcamp.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devYuri = new Dev();
        devYuri.setNome("Yuri");
        devYuri.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Yuri: " + devYuri.getConteudosInscritos());
        devYuri.progredir();
        devYuri.progredir();
        System.out.println("Conteúdo inscritos Yuri: " + devYuri.getConteudosInscritos());
        System.out.println("Conteúdo concluídos Yuri: " + devYuri.getConteudosConcluidos());
        System.out.println("XP " + devYuri.calcularTotalXP());
        System.out.println("----");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Matheus: " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println("Conteúdo inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdo concluídos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP " + devMatheus.calcularTotalXP());
        System.out.println("----");

        Dev devChadSenku = new Dev();
        devChadSenku.setNome("Chad Senku");
        devChadSenku.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Chad Senku: " + devChadSenku.getConteudosInscritos());
        devChadSenku.progredir();
        devChadSenku.progredir();
        devChadSenku.progredir();
        System.out.println("Conteúdo inscritos Chad Senku: " + devChadSenku.getConteudosInscritos());
        System.out.println("Conteúdo concluídos Chad Senku: " + devChadSenku.getConteudosConcluidos());
        System.out.println("XP " + devChadSenku.calcularTotalXP());
        System.out.println("----");

    }
}