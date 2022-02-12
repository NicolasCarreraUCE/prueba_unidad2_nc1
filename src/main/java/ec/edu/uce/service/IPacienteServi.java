package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteServi {
	void insertarPaciente(Paciente paciente);
	List<Paciente> buscarPacientePorFechaNacimientoYGerno(LocalDateTime fechaNacimiento, String genero);
}
