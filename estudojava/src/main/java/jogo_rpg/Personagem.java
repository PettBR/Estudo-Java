package jogo_rpg;

public class Personagem {

//    idPersonagem INTEGER PRIMARY KEY AUTO_INCREMENT,
//    nome VARCHAR(20) NOT NULL,
//    classe ENUM ('Bárbaro', 'Bardo', 'Bruxo', 'Clérigo', 'Druida', 'Feiticeiro', 'Guerreiro', 'Ladino', 'Mago', 'Monge', 'Paladino', 'Patrulheiro') NOT NULL,
//    raca  ENUM ('Anão', 'Elfo', 'Halfling', 'Humano', 'Draconato', 'Gnomo', 'Meio-Elfo', 'Meio-Orc', 'Tiefling') NOT NULL,
//    alinhamento ENUM ('Leal bom', 'Leal neutro', 'Leal mal', 'Neutro bom', 'Neutro verdadeiro', 'Neutro mal', 'Caótico bom', 'Caótico neutro', 'Caótico mal') NOT NULL,
//    nivel INTEGER NOT NULL DEFAULT(1),
//    vida INTEGER NOT NULL,
//    defesa INTEGER NOT NULL,
//    ataque INTEGER NOT NULL,
//    deslocamento DECIMAL(3,1) NOT NULL,
//    idJogador INTEGER NOT NULL,
//    FOREIGN KEY(idJogador) REFERENCES jogador(idJogador)

    // ENUMs:
private enum Classe{Barbaro, Bardo, Bruxo, Clerigo, Druida, Feiticeiro, Guerreiro, Ladino, Mago, Monge, Paladino, Patrulheiro};
    private enum Raca {Anao, Elfo, Halfling, Humano, Draconato, Gnomo, MeioElfo, MeioOrc, Tiefling};
    private enum Alinhamento {LealBom, LealNeutro, LealMal, NeutroBom, NeutroVerdadeiro, NeutroMal, CaoticoBom, CaoticoNeutro, CaoticoMal};

    // Propriedades/atributos:
    public int idPersonagem;
    private String nome;
    private Classe classe;
    private Raca raca;
    private Alinhamento alinhamento;
    private int nivel;
    private int vida;
    private int defesa;
    private  int ataque;
    private float deslocamento;
    public int idJogador;

    // Construtor:
    public Personagem(int idPersonagem, String nome, Classe classe, Raca raca, Alinhamento alinhamento, int nivel, int vida, int defesa, int ataque, float deslocamento, int idJogador) {
        this.idPersonagem = idPersonagem;
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.alinhamento = alinhamento;
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.deslocamento = deslocamento;
        this.idJogador = idJogador;
    }


    // Getters e Setters:
    public int getIdPersonagem() {
        return idPersonagem;
    }
    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Raca getRaca() {
        return raca;
    }
    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Alinhamento getAlinhamento() {
        return alinhamento;
    }
    public void setAlinhamento(Alinhamento alinhamento) {
        this.alinhamento = alinhamento;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public float getDeslocamento() {
        return deslocamento;
    }
    public void setDeslocamento(float deslocamento) {
        this.deslocamento = deslocamento;
    }

    public int getIdJogador() {
        return idJogador;
    }
    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }
}
