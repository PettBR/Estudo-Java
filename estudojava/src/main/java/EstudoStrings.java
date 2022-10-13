import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        // Strings são cadeias de caracteres
        // "Jose" → J = 0, o = 1, s = 2, e = 3
        String nome = "Pedro";

        if(nome == "Pedro"){
            System.out.println("São iguais!");
        }

        System.out.println(("Digite seu sobrenome"));
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();
        // Digitei: Pereira → mas vai ser armazenado em um local diferente do "Pereira" abaixo

        if(sobrenome == "Pereira"){
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes"); // Vai acusar que são diferentes, mesmo o conteúdo sendo igual
            // Porque estão armazenados em locais diferentes!
        }

        if(sobrenome.equals("Pereira")){ // aqui compara o conteúdo das strings
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        // sobrenome.equalsIgnoreCase("pereira"); ignora maiuscula e minuscula

        // Outros métodos
        String java = "Java";
        String ja = java.substring(0,2); // começa do 0 e vai até o 2 (não inclusa)
        String va = java.substring(2); //corta da posição 2 até o final da String

        System.out.println(ja);
        System.out.println(va);

        String n1 = "Hello, ";
        String n2 = "World!";
        String n3 = n1.concat(n2); // n1 + n2
        System.out.println(n3);

        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se está vazia → "" → retorna um boolean
        System.out.println(java.toUpperCase()); // JAVA
        System.out.println(java.toLowerCase()); // java

        System.out.println("Digite um nome");
        String seuNome = entrada.nextLine();

        if(seuNome.isEmpty()){
            System.out.println("Texto vazio");
        }

        if(seuNome.toUpperCase().equals("JOSÉ")){
            System.out.println("SEU NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/"); // ["13","10","2022"]
        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String[] valoresEmail = email.split("@"); // ["jose.almir", "gmail.com"]
        System.out.println(valoresEmail[0]);

        String nome2 = "Felipe Pettinati";
        String[] nomeSeparado = nome2.split(" "); // espaço
        System.out.println(nomeSeparado[0]);

        String teste = "Amanhã é sexta-feira!";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));

    }
}
