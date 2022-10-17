package exercicios;

import java.util.Scanner;

public class Listona64Exercicio4 {
    public static void main(String[] args){
        // 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.

        Scanner entrada = new Scanner(System.in);

        // Entrada dos dados
        System.out.println("Digite 4 valores numéricos inteiros; A, B, C e D.");
        System.out.println("Insira o primeiro valor(A): ");
        int valorA = entrada.nextInt();

        System.out.println("Insira o primeiro valor(B): ");
        int valorB = entrada.nextInt();

        System.out.println("Insira o primeiro valor(C): ");
        int valorC = entrada.nextInt();

        System.out.println("Insira o primeiro valor(D): ");
        int valorD = entrada.nextInt();

        // Saída dos dados de soma:
        System.out.println("Os resultados para as somas dos números inseridos: ");
        System.out.println(valorA + " + " + valorB + " = " + (valorA + valorB));
        System.out.println(valorA + " + " + valorC + " = " + (valorA + valorC));
        System.out.println(valorA + " + " + valorD + " = " + (valorA + valorD));
        System.out.println(valorB + " + " + valorC + " = " + (valorB + valorC));
        System.out.println(valorB + " + " + valorD + " = " + (valorB + valorD));
        System.out.println(valorC + " + " + valorD + " = " + (valorC + valorD));
        // Saida dos dados de multiplicação:
        System.out.println("\nOs resultados para as multiplicações dos números inseridos: ");
        System.out.println(valorA + " X " + valorB + " = " + (valorA * valorB));
        System.out.println(valorA + " X " + valorC + " = " + (valorA * valorC));
        System.out.println(valorA + " X " + valorD + " = " + (valorA * valorD));
        System.out.println(valorB + " X " + valorC + " = " + (valorB * valorC));
        System.out.println(valorB + " X " + valorD + " = " + (valorB * valorD));
        System.out.println(valorC + " X " + valorD + " = " + (valorC * valorD));

    }
}
