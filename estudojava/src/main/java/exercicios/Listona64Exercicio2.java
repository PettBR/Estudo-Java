package exercicios;

import java.util.Scanner;

public class Listona64Exercicio2 {
    public static void main(String[] args){
        // 2) Faça um programa que:
        // Leia a cotação do dólar → 1 dólar = X reais
        // Leia um valor em dólares
        // Converta esse valor para Real
        // Mostre o resultado

        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados (cotação do dólar e valor a ser convertido)
        System.out.println("Por favor digite a cotação X atual do dólar(1 Dólar → X Reais):");
        double cotacaoAtualDolar = entrada.nextDouble();

        System.out.println("Por favor, digite o valor em dólar a ser convertido para reais: ");
        double valorEmDolar = entrada.nextDouble();

        double valorEmReal = valorEmDolar * cotacaoAtualDolar;
        System.out.printf("O valor de %.2f dólares equivale a %.2f reais.\n", valorEmDolar, valorEmReal);


    }
}
