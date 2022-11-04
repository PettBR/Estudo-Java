package jogo_rpg;

public class Equipamento {

//    idEquipamento INTEGER PRIMARY KEY AUTO_INCREMENT,
//    mao_primaria VARCHAR (30),
//    mao_secundaria VARCHAR (30),
//    armadura_cabeca VARCHAR (30),
//    pescoco VARCHAR (30),
//    armadura_corpo VARCHAR (30),
//    armadura_perna VARCHAR (30) NOT NULL,
//    armadura_luva VARCHAR (30),
//    bota VARCHAR (30),
//    bonusAtk INTEGER NOT NULL DEFAULT(0),
//    bonusDef INTEGER NOT NULL DEFAULT(0),
//    idPersonagem INTEGER UNIQUE NOT NULL, -- Unique para garantir relacionamento 1:1 de equipamento com personagem
//    FOREIGN KEY(idPersonagem) REFERENCES personagem(idPersonagem)

    // Propriedades/atributos:
    public int idEquipamento;
    private String mao_primaria;
    private String mao_secundaria;
    private String armadura_cabeca;
    private String armadura_perna;
    private String armadura_luva;
    private String bota;
    private int bonusAtk;
    private int bonusDef;
    public int idPersonagem;

    // Construtor:
    public Equipamento(int idEquipamento, String mao_primaria, String mao_secundaria, String armadura_cabeca, String armadura_perna, String armadura_luva, String bota, int bonusAtk, int bonusDef, int idPersonagem) {
        this.idEquipamento = idEquipamento;
        this.mao_primaria = mao_primaria;
        this.mao_secundaria = mao_secundaria;
        this.armadura_cabeca = armadura_cabeca;
        this.armadura_perna = armadura_perna;
        this.armadura_luva = armadura_luva;
        this.bota = bota;
        this.bonusAtk = bonusAtk;
        this.bonusDef = bonusDef;
        this.idPersonagem = idPersonagem;
    }

    // Getters e Setters:
    public int getIdEquipamento() {
        return idEquipamento;
    }
    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getMao_primaria() {
        return mao_primaria;
    }
    public void setMao_primaria(String mao_primaria) {
        this.mao_primaria = mao_primaria;
    }

    public String getMao_secundaria() {
        return mao_secundaria;
    }
    public void setMao_secundaria(String mao_secundaria) {
        this.mao_secundaria = mao_secundaria;
    }

    public String getArmadura_cabeca() {
        return armadura_cabeca;
    }
    public void setArmadura_cabeca(String armadura_cabeca) {
        this.armadura_cabeca = armadura_cabeca;
    }

    public String getArmadura_perna() {
        return armadura_perna;
    }
    public void setArmadura_perna(String armadura_perna) {
        this.armadura_perna = armadura_perna;
    }

    public String getArmadura_luva() {
        return armadura_luva;
    }
    public void setArmadura_luva(String armadura_luva) {
        this.armadura_luva = armadura_luva;
    }

    public String getBota() {
        return bota;
    }
    public void setBota(String bota) {
        this.bota = bota;
    }

    public int getBonusAtk() {
        return bonusAtk;
    }
    public void setBonusAtk(int bonusAtk) {
        this.bonusAtk = bonusAtk;
    }

    public int getBonusDef() {
        return bonusDef;
    }
    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }

    public int getIdPersonagem() {
        return idPersonagem;
    }
    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }
}
