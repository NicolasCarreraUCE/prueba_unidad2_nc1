package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.repository.IDoctorRepo;

@Service
public class DoctorServiImpl implements IDoctorServi {

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public void insertarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.insertarDoctor(doctor);
	}

}
