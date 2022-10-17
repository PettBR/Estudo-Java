package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Listona64Exercicio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // 13) Escreva um programa que leia 3 números inteiros e imprima na tela
        // os valores em ordem decrescente.

        int[] numerosArray = new int[3];
        System.out.println("Digite o primeiro número: ");
        numerosArray[0] = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        numerosArray[1] = entrada.nextInt();

        System.out.println("Digite o terceiro número: ");
        numerosArray[2] = entrada.nextInt();

        // Ordenar números:
        // duplo for ou varios if else ou esse método importando o Arrays com o método sort para organizar:
        Arrays.sort(numerosArray);
        System.out.println("Os números em ordem crescente são: ");
        System.out.println(Arrays.toString(numerosArray));

    }
}
