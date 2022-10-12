import java.util.Scanner;

public class Listona64Exercicio3 {
    public static void main(String[] args){
        // 3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que
        // sua comissão será de 5% do total da venda e que você tem os seguintes dados:
        // — Identificação do vendedor
        // — Código da peça
        // — Preço unitário da peça
        // — Quantidade vendida

        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados do vendedor e da peça.
        System.out.println("Qual o nome do vendedor?");
        String nomeVendedor = entrada.nextLine();

        System.out.println("Qual o código da peça vendida?");
        String codigoPeca = entrada.nextLine();

        System.out.println("Qual o preço unitário da peça?");
        double precoPeca = entrada.nextDouble();

        System.out.println("Quantas peças foram vendidas?");
        int quantidadeVendida = entrada.nextInt();

        double comissaoVendedor = 0.05 * (precoPeca * quantidadeVendida);
        System.out.println("O valor de comissão do vendedor " + nomeVendedor + " para a peça de código " + codigoPeca + " é:");
        System.out.printf("%.2f reais de um total de %.2f\n", comissaoVendedor, (precoPeca*quantidadeVendida));

    }
}
