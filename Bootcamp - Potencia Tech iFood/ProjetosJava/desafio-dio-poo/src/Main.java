import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Fundamentos do Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Fundamentos do JavaScript");
        curso2.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("POO");
        mentoria1.setDescricao("Básico de Paradigma Orientado à Objetos");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Diferença entre Front e Back End");
        mentoria2.setDescricao("De forma fácil e descomplicada.");
        mentoria2.setData(LocalDate.now().plusDays(15));

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Potencia Tech Ifood");
        bootcamp1.setDescricao("Java Beginners");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);


        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp1);
        System.out.println(devThiago.getBootcampsInscrito().toString().toUpperCase());
        for (Conteudo conteudo : devThiago.getConteudosInscritos()) {
            System.out.println(conteudo);
        }
        System.out.println("\nXP TOTAL: " + devThiago.calcularTotalXp());

        devThiago.progredir();
        devThiago.progredir();
        devThiago.progredir();

        System.out.println(" \n ---------------------------------------- \n ");

        System.out.println(devThiago.getBootcampsInscrito().toString().toUpperCase());
        System.out.println("CURSOS NÃO CONCLUÍDOS");
        for (Conteudo conteudo : devThiago.getConteudosInscritos()) {
            System.out.println(conteudo);
        }
        System.out.println("\nCURSOS CONCLUÍDOS");
        for (Conteudo conteudo : devThiago.getConteudosConcluidos()) {
            System.out.println(conteudo);
        }
        System.out.println("\nXP TOTAL: " + devThiago.calcularTotalXp());




    }


}