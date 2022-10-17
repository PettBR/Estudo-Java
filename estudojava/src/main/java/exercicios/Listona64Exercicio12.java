package exercicios;

import java.util.Scanner;

public class Listona64Exercicio12 {
    public static void main(String[] args){
        // 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
        //O módulo de um número x é:
        //x se x é maior ou igual a zero
        //x * (-1) se x é menor que zero
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numeroA = entrada.nextDouble();
        double moduloA = numeroA;
        if (numeroA < 0){
            moduloA = numeroA * -1;
        }
        System.out.println("|" + numeroA + "| " + " = " + moduloA);
    }
}
