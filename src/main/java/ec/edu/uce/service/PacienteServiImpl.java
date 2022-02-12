package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiImpl implements IPacienteServi {

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.insertarPaciente(paciente);
	}

	@Override
	public List<Paciente> buscarPacientePorFechaNacimientoYGerno(LocalDateTime fechaNacimiento, String genero) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPacientePorFechaNacimientoYGerno(fechaNacimiento, genero);
	}

}
