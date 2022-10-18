package exercicios.listona64exercicios;

import java.util.Scanner;

public class Listona64Exercicio11 {
    public static void main(String[] args){
        // 11) Ler dois valores inteiros para as variáveis A e B,
        // efetuar a troca dos valores de modo que a variável A passe a possuir o valor da variável B,
        // e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro inteiro (A): ");
        int inteiro1 = entrada.nextInt();
        int inteiroA = inteiro1;
        System.out.println("Digite o segundo inteiro (B): ");
        int inteiro2 = entrada.nextInt();
        int inteiroB = inteiro2;

        inteiro1 = inteiroB;
        inteiro2 = inteiroA;

        System.out.println("A → " + inteiro1);
        System.out.println("B → " + inteiro2);


    }
}
