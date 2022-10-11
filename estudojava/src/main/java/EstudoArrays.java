import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args){
//        int[] numeros = {1, 2, 3, 4, 5};
//        System.out.println(numeros.length); //tamanho do array
//        numeros[3] = 1000; //posição 3 era = 4 agora é = 1000
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("A posição " + i + " com valor de " + numeros[i]);
//        }
//
//        int[] numeros2 = new int[50];
//        numeros2[0] = 500;
//        numeros2[1] = -200;
//        // ...
//        numeros2[49] = 1;
//
//        double[] notas = new double[5];
//        String[] nomes = {"José Almir", "Renato Pereira", "Victor Icoma"};
//        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

//        System.out.println("Digite um número: ");
//        int quantidade = entrada.nextInt();
//        boolean[] valores = new boolean[quantidade];

        // Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();
        double[] notasProva = new double[totalNotas];

        for(int i =0; i < totalNotas; i++){
            System.out.println("Digite o valor da " + (i+1) + "ª nota: ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        // equivalente ao 'for of'
        // para cada valor dentro de notasProva
        for(double nota : notasProva){
            soma += nota;
        }
        double media = soma / notasProva.length;

        System.out.println("A média é: " + media);

        //condição ternária
        String mensagem = (media < 7) ? "Você está reprovado" : "Você está aprovado";
        System.out.println(mensagem);

        // Default values - primitivos
        int numero; //padrão = 0
        double nota2; //padrão = 0.0
        long população; //padrão = 0
        boolean teste; //padrão = false

        // Classe String
        String nome; // padrão = null → ausência de objeto na variável

        // Wrapper classes
        Integer numero2 = 1; // padrão = null → ausência de objeto na variável
        Double nota3 = 1.0; // padrão = null → ausência de objeto na variável
        Long pop2 = 1L; // padrão = null → ausência de objeto na variável
        Boolean teste2 = false; // padrão = null → ausência de objeto na variável

    }
}
