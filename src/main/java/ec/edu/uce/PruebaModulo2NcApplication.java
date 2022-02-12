package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

@SpringBootApplication
public class PruebaModulo2NcApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(PruebaModulo2NcApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo2NcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor d1 = new Doctor();
		d1.setCedula("");
		d1.setNombre("");
		d1.setApellido("");
		d1.setFechaNacimiento(null);
		d1.setNumeroConsultorio("");
		d1.setCodigoSenescyt("");
		d1.setGenero("");
		
		Doctor d2 = new Doctor();
		d2.setCedula("");
		d2.setNombre("");
		d2.setApellido("");
		d2.setFechaNacimiento(null);
		d2.setNumeroConsultorio("");
		d2.setCodigoSenescyt("");
		d2.setGenero("");
		
		Paciente p1 = new Paciente();
		p1.setCedula("");
		p1.setNombre("");
		p1.setApellido("");
		p1.setFechaNacimiento(null);
		p1.setCodigoSeguro("");
		p1.setEstatura("");
		p1.setPeso("");
		p1.setGenero("");
		
		Paciente p2 = new Paciente();
		p2.setCedula("");
		p2.setNombre("");
		p2.setApellido("");
		p2.setFechaNacimiento(null);
		p2.setCodigoSeguro("");
		p2.setEstatura("");
		p2.setPeso("");
		p2.setGenero("");
	}

}
