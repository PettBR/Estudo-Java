import java.util.Scanner;

public class ExercicioJava1 {
    public static void main(String[] args){
        // 1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)
        //
        //  1 – Adição
        //  2 — Subtração
        //  3 — Multiplicação
        //  4 — Divisão

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a operação que deseja realizar(1 a 4).");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacao = entrada.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Você escolheu a operação de adição: A + B");
                System.out.println("Digite o primeiro número (A)");
                double numeroA1 = entrada.nextDouble();
                System.out.println("Digite o segundo número (B)");
                double numeroB1 = entrada.nextDouble();
                double somaAB = numeroA1 + numeroB1;
                System.out.println("A soma de " + numeroA1 + " e " + numeroB1 + " é " + somaAB);
                break;
            case 2:
                System.out.println("Você escolheu a operação de subtração: A - B");
                System.out.println("Digite o primeiro número (A)");
                double numeroA2 = entrada.nextDouble();
                System.out.println("Digite o segundo número (B)");
                double numeroB2 = entrada.nextDouble();
                double subtracaoAB = numeroA2 - numeroB2;
                System.out.println("A subtração de " + numeroA2 + " e " + numeroB2 + " é " + subtracaoAB);
                break;
            case 3:
                System.out.println("Você escolheu a operação de multiplicação: A * B");
                System.out.println("Digite o primeiro número (A)");
                double numeroA3 = entrada.nextDouble();
                System.out.println("Digite o segundo número (B)");
                double numeroB3 = entrada.nextDouble();
                double multiplicacaoAB = numeroA3 * numeroB3;
                System.out.println("A multiplicação de " + numeroA3 + " e " + numeroB3 + " é " + multiplicacaoAB);
                break;
            case 4:
                System.out.println("Você escolheu a operação de divisão: A / B");
                System.out.println("Digite o primeiro número (A)");
                double numeroA4 = entrada.nextDouble();
                System.out.println("Digite o segundo número (B)");
                double numeroB4 = entrada.nextDouble();
                while (numeroB4 == 0) {
                    System.out.println("Você não pode dividir por ZERO!");
                    System.out.println("Digite o segundo número (B)");
                    numeroB4 = entrada.nextDouble();
                }
                double divisaoAB = numeroA4 / numeroB4;
                System.out.println("A divisão de " + numeroA4 + " e " + numeroB4 + " é " + divisaoAB);
                break;
            default:
                System.out.println("Operação inválida!");
        }



    }
}
