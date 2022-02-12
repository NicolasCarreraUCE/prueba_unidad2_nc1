package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	void insertarPaciente(Paciente paciente);
	Paciente buscarPacientePorCedula(String cedula);
	List<Paciente> buscarPacientePorFechaNacimientoYGerno(LocalDateTime fechaNacimiento, String genero);
}
