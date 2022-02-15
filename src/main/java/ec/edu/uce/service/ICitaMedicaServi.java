package ec.edu.uce.service;

import ec.edu.uce.modelo.CitaMedica;

public interface ICitaMedicaServi {
	void insertarCitaMedica(CitaMedica citaMedica);
	CitaMedica buscarCitaMedica(Integer id);
	void actualizarCitaMedica(CitaMedica citaMedica);
	void borrarCitaMedica(Integer id);
	
}
