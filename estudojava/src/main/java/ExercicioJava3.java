import java.util.Scanner;

public class ExercicioJava3 {
    public static void  main(String[] args){
        // 3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
        // Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas mesmas posições.

        Scanner entrada = new Scanner(System.in);

       System.out.println("Digite o tamanho dos vetores (máx de 50): ");
       int tamanhoVetores = entrada.nextInt();
        // Garantindo tamanho máximo de 50
        while (tamanhoVetores > 50) {
            System.out.println("Você escolheu um vetor muito grande! O tamanho máximo é de 50.");
            System.out.println("Digite o tamanho dos vetores (máx de 50): ");
            tamanhoVetores = entrada.nextInt();
        }
        // Gerando o primeiro vetor (V1)
        System.out.println("Digite os valores do primeiro vetor (V1): ");
        int[] vetor1 = new int[tamanhoVetores];
        for(int i =0; i < tamanhoVetores; i++){
            System.out.println("Digite o " + (i+1) + "º valor: ");
            vetor1[i] = entrada.nextInt();
        }

        // Gerando o segundo vetor (V2)
        System.out.println("Digite os valores do segundo vetor (V2): ");
        int[] vetor2 = new int[tamanhoVetores];
        for(int i =0; i < tamanhoVetores; i++){
            System.out.println("Digite o " + (i+1) + "º valor: ");
            vetor2[i] = entrada.nextInt();
        }
        // Comparando os valores dos vetores nas mesmas posições.
        int contador = 0;
        for (int i = 0; i < tamanhoVetores; i++){
            if (vetor1[i] == vetor2[i]){
                contador += 1;
            }
        }
        System.out.println("Os vetores V1 e V2 têm valores idênticos nas mesmas posições " + contador + " vezes.");
    }
}
