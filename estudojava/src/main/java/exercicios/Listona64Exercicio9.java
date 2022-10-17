package exercicios;

import java.util.Scanner;

public class Listona64Exercicio9 {
    public static void main(String[] args){
        // 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
        //pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite a sua idade em anos, meses e dias: ");
        System.out.println("Digite primeiro a idade em anos: ");
        int idadeAnos = entrada.nextInt();

        System.out.println("Digite agora a idade em meses: ");
        int idadeMeses = entrada.nextInt();

        System.out.println("Finalmente, digite a idade em dias: ");
        int idadeDias = entrada.nextInt();

        // Processamento de Dados
        int idadeTotalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        // Saída de Dados
        System.out.println("A idade total em dias é " + idadeTotalDias);

    }
}
