package exercicios;

import java.util.Scanner;

public class ExercicioJava4 {
    public static void main(String[] args){
        // 4) Criar um programa que lê a idade de uma pessoa e diz se ela é maior de idade ou não.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();
        if(idade >= 18){
            System.out.println("Parabéns, você já pode ser preso! Digo, você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade ainda. Aproveite!");
        }
    }
}
