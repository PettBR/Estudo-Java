import java.util.Scanner;

public class Listona64Exercicio10 {
    public static void main(String[] args){
        // 10) Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos
        // de ordem existentes entre eles.
        // Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro inteiro: ");
        int inteiro1 = entrada.nextInt();

        System.out.println("Digite o segundo inteiro: ");
        int inteiro2 = entrada.nextInt();

        boolean igualdade = inteiro1 == inteiro2;
        boolean desigualdade = inteiro1 != inteiro2;
        boolean maiorQ = inteiro1 > inteiro2;
        boolean menorQ = inteiro1 < inteiro2;
        boolean maiorIgualQ = inteiro1 >= inteiro2;
        boolean menorIgualQ = inteiro1 <= inteiro2;

        System.out.println(inteiro1 + " = " + inteiro2 + " → " + igualdade);
        System.out.println(inteiro1 + " ≠ " + inteiro2 + " → " + desigualdade);
        System.out.println(inteiro1 + " > " + inteiro2 + " → " + maiorQ);
        System.out.println(inteiro1 + " < " + inteiro2 + " → " + menorQ);
        System.out.println(inteiro1 + " ≥ " + inteiro2 + " → " + maiorIgualQ);
        System.out.println(inteiro1 + " ≤ " + inteiro2 + " → " + menorIgualQ);


    }
}
