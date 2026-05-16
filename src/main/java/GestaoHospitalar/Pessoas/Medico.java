package GestaoHospitalar.Pessoas;

import GestaoHospitalar.Pessoa;
import GestaoHospitalar.Visitor;

public class Medico implements Pessoa {

    private String crm;
    private String nome;
    private String especialidade;

    public Medico(String crm, String nome, String especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }

}
