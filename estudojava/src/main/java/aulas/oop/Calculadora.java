package aulas.oop;

public class Calculadora {
    // atributo estático
    public static final double PIsimples = 3.14;
    // final = impede a alteração do valor de PIsimples

    // Método estático
    // Não pertence ao objeto, mas sim a classe
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
            return a / b;
    }

    // main = auto-executável
    public static void main(String[] args) {
        // O método Static dispensa a chamada de um objeto para executar seus métodos
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtracao(10,5);
        double resultadoMult = Calculadora.multiplicacao(10,2);
        double resultadoDiv = Calculadora.divisao(10,5);
        System.out.println(Calculadora.PIsimples);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144));
        System.out.println(Math.cbrt(8));

    }

}
