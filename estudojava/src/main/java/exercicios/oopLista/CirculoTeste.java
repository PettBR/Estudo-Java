package exercicios.oopLista;

public class CirculoTeste {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("amarelo");
        System.out.println(circulo1.calcularArea());

        Circulo circulo2 = new Circulo(2,"azul");
        System.out.println(circulo2.calcularArea());

        System.out.println(circulo1.calcularCircunferencia());
        System.out.println(circulo2.calcularCircunferencia());
        circulo1.mudarRaio(2);
        circulo2.mudarRaio(2.5);
        System.out.println("O circulo tem raio de " + circulo1.raio + " e cor " + circulo1.cor);

    }
}
