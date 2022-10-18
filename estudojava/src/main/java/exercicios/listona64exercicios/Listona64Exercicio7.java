package exercicios.listona64exercicios;

import java.util.Scanner;

public class Listona64Exercicio7 {
    public static void main(String[] args){
        //7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
        //temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
        //variável C é a temperatura em graus Celsius.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = entrada.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.printf("\n %.2f °F → %.2f °C", temperaturaFahrenheit, temperaturaCelsius);

    }
}
