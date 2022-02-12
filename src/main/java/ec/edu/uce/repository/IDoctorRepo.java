package ec.edu.uce.repository;

import ec.edu.uce.modelo.Doctor;

public interface IDoctorRepo {
	void insertarDoctor(Doctor doctor);
	Doctor buscarDoctorPorCedula(String cedula);
}
