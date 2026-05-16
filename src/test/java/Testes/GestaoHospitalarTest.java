package Testes;

import GestaoHospitalar.PessoaVisitor;
import GestaoHospitalar.Pessoas.Enfermeiro;
import GestaoHospitalar.Pessoas.Medico;
import GestaoHospitalar.Pessoas.Paciente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestaoHospitalarTest {

    @Test
    void deveExibirPaciente() {
        Paciente paciente = new Paciente(1001, "Carlos Souza", "Unimed");
        PessoaVisitor visitor = new PessoaVisitor();

        String resultadoEsperado = "Paciente{prontuario=1001, nome='Carlos Souza', convenio='Unimed'}";
        assertEquals(resultadoEsperado, visitor.exibir(paciente));
    }

    @Test
    void deveExibirMedico() {
        Medico medico = new Medico("12345-SP", "Dra. Ana Clara", "Cardiologia");
        PessoaVisitor visitor = new PessoaVisitor();

        String resultadoEsperado = "Medico{crm='12345-SP', nome='Dra. Ana Clara', especialidade='Cardiologia'}";
        assertEquals(resultadoEsperado, visitor.exibir(medico));
    }

    @Test
    void deveExibirEnfermeiro() {
        Enfermeiro enfermeiro = new Enfermeiro("98765-RJ", "João Pedro", "Emergência");
        PessoaVisitor visitor = new PessoaVisitor();

        String resultadoEsperado = "Enfermeiro{coren='98765-RJ', nome='João Pedro', setor='Emergência'}";
        assertEquals(resultadoEsperado, visitor.exibir(enfermeiro));
    }

}
