import java.util.Scanner;

public class Listona64Exercicio1 {
    public static void main(String[] args){
        // 1) Faça um programa para calcular o estoque médio de uma peça, sendo que:
        //ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.

        // Importação do Scanner
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados

            System.out.println("Digite a quantidade mínima do estoque: ");
            int quantidadeMinima = entrada.nextInt();
            System.out.println("Digite a quantidade máxima do estoque: ");
            int quantidadeMaxima = entrada.nextInt();

        // Embora não faça diferença para o cálculo da média, acho válido verificar que a quantidade máxima não seja menor que a mínima
        while(quantidadeMaxima < quantidadeMinima) {
            System.out.println("A quantidade máxima não pode ser menor que a mínima!");
            System.out.println("Digite a quantidade mínima do estoque: ");
            quantidadeMinima = entrada.nextInt();
            System.out.println("Digite a quantidade máxima do estoque: ");
            quantidadeMaxima = entrada.nextInt();
        }

        // Processamento dos dados (Necessário dar um casting de double em um dos dados dado que a média precisa ser um double
        double media = (quantidadeMinima + (double) quantidadeMaxima) / 2;

        // Saída dos dados
        System.out.println("O estoque médio é: " + media);

    }
}
