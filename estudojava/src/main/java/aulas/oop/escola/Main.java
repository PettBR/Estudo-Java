package aulas.oop.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos José", "carlos.joe@mail.com","123.456.789-10",7.5);
        aluno.seApresentar();

        Professor prof = new Professor("Joao Pedro","joao@mail.com","987.654.321-00","TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria Antonia","maria@mail.com","147.258.369-00");
        p1.seApresentar();

        // Aluno é uma Pessoa
        Pessoa p2 = new Aluno("Carlos José", "carlos.joe@mail.com","123.456.789-10",7.5);
        // Professor é uma Pessoa
        Pessoa p3 = new Professor("Joao Pedro","joao@mail.com","987.654.321-00","TI");

        System.out.println("=========================");
        p2.seApresentar();
        p3.seApresentar();

        // Polimorfismo
        System.out.println(" === PESSOAS ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa : pessoas) {
            // o método seApresentar se comporta diferente dependendo
            // da classe original
            pessoa.seApresentar();
        }

        //  Então chamando como:
        // Aluno aluno1 = new Aluno( propriedades );
        // Ele vai ter todos os métodos e atributos próprios de um aluno

        // Agora se eu fizer:
        // Pessoa aluno2 = new Aluno( propriedades );
        // Ele não vai ter TODOS os métodos da classe Aluno,
        // somente os de Pessoa E os sobrescritos de Aluno com @Override


    }
}
