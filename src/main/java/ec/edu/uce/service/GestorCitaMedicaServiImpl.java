package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.CitaMedicaRepoImpl;

@Service
public class GestorCitaMedicaServiImpl implements IGestorCitaServi {

	private static final Logger LOG = LoggerFactory.getLogger(GestorCitaMedicaServiImpl.class);
	
	@Autowired
	private IDoctorServi doctorServi;
	
	@Autowired 
	private IPacienteServi pacienteServi;
	
	@Autowired
	private ICitaMedicaServi citaMedicaServi;
	
	@Override
	public void agendamientoCitaMedica(String numeroDeCita, LocalDateTime fechaCita, BigDecimal valorCita,
			String lugarCita, String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumeroCita(numeroDeCita);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValorCita(valorCita);
		citaMedica.setLugarCita(lugarCita);
		
		this.citaMedicaServi.insertarCitaMedica(citaMedica);
	}

	@Override
	public void actualizaciónCitaMedica(String numeroDeCita, String diagnostico, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		this.citaMedicaServi.actualizarCitaMedica(citaMedica);
	}

	@Override
	public void reporteDePacientes(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		List<Paciente> pacientes = new ArrayList<Paciente>();
		for(Paciente paciente : pacientes) {
			LOG.info(paciente.toString());
		}
	}

}
