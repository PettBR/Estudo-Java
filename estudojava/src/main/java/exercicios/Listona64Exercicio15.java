package exercicios;

import java.util.Scanner;

public class Listona64Exercicio15 {
    public static void main(String[] args) {
        // 15) Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
        //aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
        //do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
        //apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
        //apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
        //aluno.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as 4 notas do aluno: ");
        double notaA = entrada.nextDouble();
        double notaB = entrada.nextDouble();
        double notaC = entrada.nextDouble();
        double notaD = entrada.nextDouble();
        double media = (notaA + notaB + notaC + notaD)/4;

        if(media > 7){
            System.out.println("Aluno aprovado com a média " + media);
        } else {
            System.out.println("Aluno está em recuperação com a média: " + media);
            System.out.println("Insira a nota da prova de recuperação: ");
            double notaR = entrada.nextDouble();
            media = (media + notaR)/2;
            if(media > 7){
                System.out.println("Aluno aprovado na recuperação com a média " + media);
            } else {
                System.out.println("Aluno reprovado com a média " + media);
            }
        }

    }
}
