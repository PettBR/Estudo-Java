package exercicios.oopLista;

public class Circulo {

    double raio;
    String cor;

    // Construtor de círculos de Raio = 1
    Circulo(String cor){
        this.raio = 1;
        this.cor = cor;
    }

    // Construtor de círculos de qualquer raio
    Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double calcularArea() {
        return (Math.PI * this.raio * this.raio);
    }

    public double calcularCircunferencia() {
        return (2 * Math.PI * this.raio);
    }

    public void mudarRaio(double novoRaio){
        this.raio = novoRaio;
    }



}
