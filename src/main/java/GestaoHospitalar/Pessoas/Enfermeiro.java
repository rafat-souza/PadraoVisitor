package GestaoHospitalar.Pessoas;

import GestaoHospitalar.Pessoa;
import GestaoHospitalar.Visitor;

public class Enfermeiro implements Pessoa {

    private String coren;
    private String nome;
    private String setor;

    public Enfermeiro(String coren, String nome, String setor) {
        this.coren = coren;
        this.nome = nome;
        this.setor = setor;
    }

    public String getCoren() {
        return coren;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEnfermeiro(this);
    }

}
