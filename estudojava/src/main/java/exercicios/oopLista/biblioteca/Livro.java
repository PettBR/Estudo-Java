package exercicios.oopLista.biblioteca;

import java.util.ArrayList;

/**
 * Crie uma classe Livro que possui:
 *     * Atributos: nome, autor, preco;
 *     * Construtores:
 *         - Cria livros com base nos parâmetros nome,
 *         autor(objeto da classe Autor), preco;
 */
public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    // Esse Override é para poder aparecer como string no arraylist dos livros    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor=" + autor +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK", "jkh@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra filosofal", jk,40.69);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());

        Livro camaraSecreta = jk.escreverLivros("Harry Potter e a câmara secreta",30);

        Livro prisioneiroAzk = jk.escreverLivros("Harry Potter e o prisioneiro de Azkaban",40);

        jk.setNome("JK, a pessoa vil");
        System.out.println(camaraSecreta.autor.getNome());
        System.out.println(camaraSecreta.autor.getEmail());
        System.out.println(prisioneiroAzk.autor.getNome());

        ArrayList<Livro> livrosJK = new ArrayList<>();
        livrosJK.add(pedraFilosofal);
        livrosJK.add(camaraSecreta);
        livrosJK.add(prisioneiroAzk);

        System.out.println(livrosJK);
    }

}
