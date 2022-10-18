package exercicios.listona64exercicios;

import java.util.Scanner;

public class Listona64Exercicio14 {
    public static void main(String[] args) {
        // 14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numeroA = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        double numeroB = entrada.nextInt();

        double resultado = Math.abs(numeroA-numeroB);
        if(numeroA > numeroB){
            System.out.println("O número " + numeroA + " é maior que " + numeroB + " e a diferença entre eles é " + resultado);
        } else if(numeroB > numeroA){
            System.out.println("O número " + numeroB + " é maior que " + numeroA + " e a diferença entre eles é " + resultado);
        } else{
            System.out.println("Os números são iguais! A diferença entre eles é:  " + resultado);
        }

    }
}
