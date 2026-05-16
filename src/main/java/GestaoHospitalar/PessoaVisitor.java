package GestaoHospitalar;

import GestaoHospitalar.Pessoas.Enfermeiro;
import GestaoHospitalar.Pessoas.Medico;
import GestaoHospitalar.Pessoas.Paciente;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "prontuario=" + paciente.getProntuario() +
                ", nome='" + paciente.getNome() + '\'' +
                ", convenio='" + paciente.getConvenio() + '\'' +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "crm='" + medico.getCrm() + '\'' +
                ", nome='" + medico.getNome() + '\'' +
                ", especialidade='" + medico.getEspecialidade() + '\'' +
                '}';
    }

    @Override
    public String exibirEnfermeiro(Enfermeiro enfermeiro) {
        return "Enfermeiro{" +
                "coren='" + enfermeiro.getCoren() + '\'' +
                ", nome='" + enfermeiro.getNome() + '\'' +
                ", setor='" + enfermeiro.getSetor() + '\'' +
                '}';
    }

}
