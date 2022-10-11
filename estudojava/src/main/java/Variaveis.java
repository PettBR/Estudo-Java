public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args) {
        System.out.println("Hello, World!"); //equivale ao console.log

        // Variáveis no JAVA
        // fortemente tipado e estaticamente tipado
        int idade = 20; //inteiro (até 2 Bilhões mais ou menos)
        double salario = 4500.99; // dupla precisão de casas decimais
        float nota = 7.5f; //f → sufixo para float
        long populacaoTerra = 7_900_000_000l; // l → sufixo para long | os _ são apenas para facilitar a nossa visualização
        boolean tarefaConcluida = false; //(true ou false)
        int i = 1, j = 0, k = 1000; //múltiplas variáveis
        String nomeCompleto = "Felipe Pettinati"; //sempre aspas duplas

        int teste = 10;
        teste = 9; //reatribuição de variáveis

        final int testeDois = 200; //final → torna impossível mudar o valor
        //testeDois = 1000;

        // Operadores
        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b; // 5
        int mutiplicacao = a* b; // 50
        int divisao = a / b; // 2

        System.out.println("O resultado da soma é " + soma);
        // A DIVISÃO ENTRE DOIS INTEIROS RESULTA EM INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete/dois; // resultado 3 → ambas eram inteiros
        System.out.println(resultado);
        double resultado2 = sete/dois2; // resultado 3.5 → pelo menos um deles era um double
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); // 12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);

        // Casting
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // resultado 3.5 → pois dei um casting de um double

        // Operadores 2
        int valor = 5;
        valor++;
        valor--;
        valor += 10;

        // Operadores relacionais
        boolean teste1 = 5 > 3; // true
        boolean teste2 = 5 < 1; // false
        boolean teste3 = 5 == 5; // true
        boolean teste4 = 5 != 1; // true
        boolean teste5 = 6 >= 6; // true
        boolean teste6 = 5 <= 9; // true

        // Operadores lógicos
        boolean teste7 = true && false; // false
        boolean teste8 = true || false; // true
        boolean teste9 = (5 > 10) && (10 < 5); // false
        boolean teste10 = (10 >= 0) || (1 < 5); // true
        boolean teste11 = (5 > 1); // true
        boolean teste12 = !teste11; // false (! = operador not)

    }
}
