package exercicios.oopLista;

public class AutorTeste {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Godofredo", "Godo@fredo.com");

        System.out.println(autor1.nome);
        System.out.println(autor1.email);

        autor1.mudarNome("O Mal");
        autor1.mudarEmail("Mal@castelo.com");

        System.out.println(autor1.nome);
        System.out.println(autor1.email);

    }
}
