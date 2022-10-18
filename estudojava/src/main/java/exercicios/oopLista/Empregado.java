package exercicios.oopLista;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;

    // Construtores
    Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    // Métodos
    public double calcularSalarioAnual(){
        return (12 * this.salario);
    }

    public void aumentarSalario(double aumento){
        this.salario += aumento;
    }

    public String nomeCompleto(){
        return (this.nome + " " + this.sobrenome);
    }


}
