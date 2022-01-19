import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 =new Mentoria();

        mentoria1.setTitulo("Mentoria deJava");
        mentoria1.setDescricao("Descrição mentoruia Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Everton");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Everton " + dev.getConteudosinscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Inscritos Everton " + dev.getConteudosinscritos());
        System.out.println("Conteúdos Concluídos Everton " + dev.getConteudosConcluidos());
        System.out.println("XP " + dev.calcularTotalXp());

        System.out.println("--------------------------");

        Dev dev2 = new Dev();
        dev.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João " + dev2.getConteudosinscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos João " + dev2.getConteudosinscritos());
        System.out.println("Conteúdos Concluídos João " + dev2.getConteudosConcluidos());
        System.out.println("XP " + dev2.calcularTotalXp());


    }
}
