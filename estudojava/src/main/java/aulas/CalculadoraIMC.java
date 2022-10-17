package aulas;

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
        System.out.printf("Este é o seu IMC = %.2f\n", imc); // .2 → trunca para 2 casas decimais; %f fazer a chamada de um double
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);

        if (imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <=24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }

        // Switch-case
        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Água");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break; //impedir de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default: // é como se fosse um ""else""
                System.out.println("Esta dieta não existe!");
        }

        System.out.println("Você tem quantos alimentos favoritos?");
        int totalAlimentos = entrada.nextInt();

        for(int i = 0; i < totalAlimentos; i++){
            System.out.println("Digite o " + (i+1) + " º alimento");
            String alimento = entrada.next();
            System.out.println("Você gosta de " + alimento);
        }
        int i = 0;
        while (i < totalAlimentos) {
            System.out.println(i);
            i++;
        }

        System.out.println(i);
    }
}
