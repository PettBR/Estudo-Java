package jogo_rpg;

import java.time.LocalDate;
import java.util.Date;

public class Jogador {

//    idJogador INTEGER PRIMARY KEY AUTO_INCREMENT, -- CHAVE PRIMÁRIA
//    nome VARCHAR(50) NOT NULL,
//    idade INTEGER NOT NULL,
//    email VARCHAR(50) UNIQUE NOT NULL,
//    usuario VARCHAR(20) UNIQUE NOT NULL,
//    senha VARCHAR(30) NOT NULL,
//    dataEntrada DATE NOT NULL DEFAULT(CURRENT_DATE)

    // Propriedades/atributos:
    public int idJogador;
    private String nome;
    private int idade;
    private String email;
    private String usuario;
    private String senha;
    private LocalDate dataEntrada;

    // Construtor:
    public Jogador(int idJogador, String nome, int idade, String email, String usuario, String senha, LocalDate dataEntrada) {
        this.idJogador = idJogador;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.dataEntrada = dataEntrada;
    }


    // Getters e Setters:
    public int getIdJogador() {
        return idJogador;
    }
    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 3) {
            System.out.println("idade invalida");
        } else {
           this.idade = idade;
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(!email.contains("@")) { // se está sem @
            System.out.println("email invalido");
            this.email = null;
        } else {
            this.email = email;
        }
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        if(senha.length() >= 6){
            this.senha = senha;
        } else{
            System.out.println("senha muito curta");
        }

    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
