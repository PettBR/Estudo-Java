package exercicios;

import java.util.Scanner;

public class Listona64Exercicio6 {
    public static void main(String[] args){
        // 6) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão de
        //temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
        //Fahrenheit e a variável C representa é a temperatura em graus Celsius.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = entrada.nextDouble();

        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
        System.out.printf("\n %.2f °C → %.2f °F", temperaturaCelsius, temperaturaFahrenheit);

    }
}
