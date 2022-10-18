package exercicios.listona64exercicios;

import java.util.Scanner;

public class Listona64Exercicio5 {
    public static void main(String[] args){
        // 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
        // utilizando um automóvel que faz 12 Km por litro.
        //  Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
        //  Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
        //  Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada
        // na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12.
        //  O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e
        // a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.

        Scanner entrada = new Scanner(System.in);
        // Entrada dos dados.
        System.out.println("Digite a capacidade em Km/L do carro, por exemplo 12 Km/L: ");
        double quilometragem = entrada.nextDouble();

        System.out.println("Insira o tempo de viagem com o carro em horas: ");
        double tempoViagem = entrada.nextDouble();
        System.out.println("Insira a velocidade média na viagem em km/h: ");
        double velocidadeMedia = entrada.nextDouble();

        // Processamento de dados
        double distancia = tempoViagem * velocidadeMedia;
        double litragem = distancia / quilometragem;

        // Saída de dados
        System.out.printf("\nA quilometragem por litro do veículo é: %.2f Km/L", quilometragem);
        System.out.printf("\nO tempo gasto é: %.2f horas", tempoViagem);
        System.out.printf("\nA velocidade média é: %.2f Km/h", velocidadeMedia);
        System.out.printf("\nA distância percorrida é: %.2f Km", distancia);
        System.out.printf("\nA quantidade de litros utilizada é: %.2f Litros", litragem);


    }
}
