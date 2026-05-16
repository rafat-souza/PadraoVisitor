package GestaoHospitalar;

import GestaoHospitalar.Pessoas.Enfermeiro;
import GestaoHospitalar.Pessoas.Medico;
import GestaoHospitalar.Pessoas.Paciente;

public interface Visitor {

    String exibirPaciente(Paciente paciente);
    String exibirMedico(Medico medico);
    String exibirEnfermeiro(Enfermeiro enfermeiro);

}
