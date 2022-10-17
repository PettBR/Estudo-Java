package exercicios;

import java.util.Scanner;

public class ExercicioJava2 {
    public static void main(String[] args) {
        // 2) Faça um programa que exiba os números de 1 até 2000.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite até quanto quer fazer a contagem");
        int numeroMax = entrada.nextInt();

        for(int i = 0; i < numeroMax; i++){
            if (i != 0) {
                System.out.print(", " + (i + 1));
            } else {
                System.out.print(i + 1);
            }
        }

    }
}
