import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (em metros)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual o seu peso? (em Kg)");
        double peso = entrada.nextDouble();

        // Calcule o IMC = PESO / ALTURA ^ 2

        double imc = peso/ Math.pow(altura, 2);

        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos!");
        System.out.println("O IMC é " + imc);
        System.out.printf("Este é o seu IMC = %.2f\n", imc); // .2 → trunca pra 2 casas decimais ; %f fazer a chamada de um double
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);


    }
}
