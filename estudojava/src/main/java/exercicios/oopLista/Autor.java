package exercicios.oopLista;

public class Autor {
    String nome;
    String email;

    // construtor
    Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Métodos

    public void mudarNome(String novoNome){
        this.nome = novoNome;
    }

    public void mudarEmail(String novoEmail){
        this.email = novoEmail;
    }


}
