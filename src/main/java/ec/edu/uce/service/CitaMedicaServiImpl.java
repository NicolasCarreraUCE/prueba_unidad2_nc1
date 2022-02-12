package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiImpl implements ICitaMedicaServi {

	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;
	
	@Override
	public void insertarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.insertarCitaMedica(citaMedica);
	}

	@Override
	public void actualizarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.actualizarCitaMedica(citaMedica);
	}

}
