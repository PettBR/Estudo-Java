package exercicios.oopLista;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Felipe", "Pettinati", 2000.00);

        System.out.println(empregado1.nomeCompleto());
        System.out.println(empregado1.calcularSalarioAnual());
        empregado1.aumentarSalario(4000.00);
        System.out.println(empregado1.calcularSalarioAnual());


    }
}
