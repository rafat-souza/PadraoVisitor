package GestaoHospitalar.Pessoas;

import GestaoHospitalar.Pessoa;
import GestaoHospitalar.Visitor;

public class Paciente implements Pessoa {

    private int prontuario;
    private String nome;
    private String convenio;

    public Paciente(int prontuario, String nome, String convenio) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.convenio = convenio;
    }

    public int getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public String getConvenio() {
        return convenio;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }

}
