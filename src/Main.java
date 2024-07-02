import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBarbara = new Dev();
        devBarbara.setNome("Barbara");
        devBarbara.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devBarbara.getConteudosInscritos());
        devBarbara.progredir();
        devBarbara.progredir();
        System.out.println("Conteudos Incritos" + devBarbara.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devBarbara.getConteudosConcluidos());
        System.out.println("XP" +devBarbara.calcularTotalXp());


        System.out.println("------");

        Dev devGilmar = new Dev();
        devGilmar.setNome("Gilmar");
        devGilmar.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGilmar.getConteudosInscritos());
        devGilmar.progredir();
        System.out.println("Conteudos Inscritos" + devGilmar.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devGilmar.getConteudosConcluidos());
        System.out.println("XP" +devGilmar.calcularTotalXp());


        }
    }
