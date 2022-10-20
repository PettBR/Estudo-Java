package aulas.oop.zoo;

// Na interface você define um conjunto de métodos (sem corpo)
// E a classe que você "herda" deve implementar estes métodos

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}
// Gato precisa implementar os métodos
class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("ZzzZzz Nyaaah");
    }

    @Override
    public void fazerSom(){
        System.out.println("Meow");
    }

    @Override
    public void comer(String comida) {
        if(comida.equals("Peixe")) {
            System.out.println("Peixe é miau-muito bom");
        } else {
            System.out.println("Só como peixe, humano");
        }
    }

    public void ronronar() {
        System.out.println("RRRRRRRrrr :3");
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có Zzz cocó ZZz");
    }

    @Override
    public void fazerSom(){
        System.out.println("Pó pô pó");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hmm adoro có có comida! Vou comer " + comida);
    }

    public void botarOvo() {
        System.out.println("ovo colocado");
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();
        Gato gato2 = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");
        galinha.botarOvo();

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");
        gato.ronronar();

        gato2.fazerSom();

        // Interface não consigo criar um novo objeto
        // Animal novoAnimal = new Animal(); //não consigo criar pois é Interface

        Animal animalGalinha = galinha;
        Animal animalGatinho = gato;
        System.out.println(" === POLIMORFISMO === ");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();


    }
}