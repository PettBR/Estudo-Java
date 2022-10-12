import java.util.Scanner;

public class Listona64Exercicio8 {
    public static void main(String[] args){
        // 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
        //V = 3.14159 * R * R * A
        //Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.

        Scanner entrada = new Scanner(System.in);
        // Entrada de Dados
        System.out.println("Digite a altura da lata: ");
        double alturaLata = entrada.nextDouble();

        System.out.println("Digite o raio da lata: ");
        double raioLata = entrada.nextDouble();
        // Saída de Dados
        double volumeLata = Math.PI * Math.pow(raioLata,2) * alturaLata;
        System.out.println("Volume da lata: " + volumeLata);

    }
}
