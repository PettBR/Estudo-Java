package exercicios;

import java.util.Scanner;

public class ExercicioJava5 {
    public static void main(String[] args){
        // 5) Criar programa java que lê N e depois N valores armazenados no array,
        // em seguida retorna a soma total e a média dos valores.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores (máx de 50): ");
        int tamanhoVetores = entrada.nextInt();

        // Gerando o vetor (V1)
        System.out.println("Digite os valores do primeiro vetor (V1): ");
        double[] vetor1 = new double[tamanhoVetores];
        for(int i =0; i < tamanhoVetores; i++){
            System.out.println("Digite o " + (i+1) + "º valor: ");
            vetor1[i] = entrada.nextDouble();
        }

        double soma = 0.00;
        // Somando cada valor do vetor.
        int contador = 0;
        for (int i = 0; i < tamanhoVetores; i++){
            soma += vetor1[i];
        }
        double media = soma/vetor1.length;

        System.out.println("A soma dos valores do vetor é " + soma + " e a média dos valores é " + media);
    }
}
