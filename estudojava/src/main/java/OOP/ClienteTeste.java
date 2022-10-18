package OOP;

import java.time.LocalDate;

// Encapsulamento →
// Escolhe quais atributos/métodos serão visíveis fora da classe
// public (padrão) → visível para todos
// private → os métodos/atributos são visíveis apenas na classe

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Felipe", "Pettinati", LocalDate.of(1993,5,25), 1.85, 95);

//        System.out.println(cliente1.nome);
//        System.out.println(cliente1.dataNascimento);
//        cliente1.nome = "Pedro";
//        cliente1.altura = "2.5";
//        System.out.println(cliente1.nome);
//        System.out.println(cliente1.id);
//
        cliente1.crescer();
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);
        cliente1.setAltura(1.5);


    }
}
