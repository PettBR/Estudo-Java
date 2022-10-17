package OOP;

// intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new → constroi um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José"; //obj.atributo
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        System.out.println(pessoa1.nome);
        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 55, 1.80,80);

        // O JAVA identifica o construtor para ser usado a partir dos parâmetros do construtor
        Pessoa recemNascido = new Pessoa("Enzo","Pereira");
        System.out.println(recemNascido.altura); // altura de 0.1 porque pegou o construtor de Pessoa (recém nascida)
        recemNascido.idade++; // envelheceu
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");

    }
}
