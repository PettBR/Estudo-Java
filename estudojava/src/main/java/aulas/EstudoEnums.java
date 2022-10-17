package aulas;// Enums são estruturas com constantes definidas
// Dias da semana, meses do ano, turnos do dia, estações
// Niveis (junior, pleno, senior), Feriados nacionais,
// Naipes de cartas, signos, etc

public class EstudoEnums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA; //enum.CONSTANTE
        System.out.println(hoje);

        enum NivelDev{ JUNIOR, PLENO, SENIOR }
        NivelDev nivelNulo; // Null
        NivelDev nivel = NivelDev.PLENO;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); // o valor de name precisa ser JUNIOR, PLENO, SENIOR

        switch (nivel){
            case JUNIOR:
                System.out.println("Seu nível é Junior");
                break;
            case PLENO:
                System.out.println("Seu nível é Pleno");
                break;
            case SENIOR:
                System.out.println("Seu nível é Senior");
                break;
        }

        // versão enhanced
        switch (nivel) {
            case JUNIOR -> { // pra um bloco maior de código coloco chaves
                System.out.println("Seu nível é Junior");
                System.out.println("Todos começam de algum lugar, não é mesmo?");
            }
            case PLENO -> System.out.println("Seu nível é Pleno");
            case SENIOR -> System.out.println("Seu nível é Senior");
        }

    }
}
