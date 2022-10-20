package aulas.oop.escola;

public class Aluno extends Pessoa{
    private double media;

    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); // estou chamando um construtor de Pessoa
        this.media = media;
    }

    @Override
    public void seApresentar() {// na sobrescrita APENAS mudamos o comportamento
        // Ou seja, não poderia mudar os parâmetros do método nem o encapsulamento
        super.seApresentar(); // super = a super classe do Aluno = Pessoa
        System.out.println("Eu sou um aluno com média = " + this.media);
    }

    public double getMedia() {
        return this.media;
    }
}
