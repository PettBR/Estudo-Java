package aulas.oop;
// o extends Object é redundante
// pq o Objects é uma super classe de toda classe,
//
public class Bicicleta extends Object{
    private int marcha;
    private int velocidade;

    public Bicicleta(int marcha, int velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() { // retornar a representação do objeto em string
        return "Bicicleta(marcha=" + this.marcha + ", " + "velocidade=" + this.velocidade + ")";
    }

    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta(21,0);
        Bicicleta bicicleta2 = new Bicicleta(15,10);
        System.out.println(bicicleta1);
        System.out.println(bicicleta2);
    }


}
