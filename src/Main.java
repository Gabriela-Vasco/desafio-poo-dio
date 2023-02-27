import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso sobre JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        //Exemplo de polimorfismo
        Conteudo conteudo = new Curso();

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java POO");
        bootcamp1.setDescricao("Bootcamp sobre Programação Orientada a Objetos em Java");
        bootcamp1.getConteudosBootcamps().add(curso1);
        bootcamp1.getConteudosBootcamps().add(curso2);
        bootcamp1.getConteudosBootcamps().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriela");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
