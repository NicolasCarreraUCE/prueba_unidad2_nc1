package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.ICitaMedicaServi;
import ec.edu.uce.service.IDoctorServi;
import ec.edu.uce.service.IGestorCitaServi;
import ec.edu.uce.service.IPacienteServi;

@SpringBootApplication
public class ProyectoPruebaApplication implements CommandLineRunner {

	@Autowired
	private IGestorCitaServi gestorCitaServi;
	
	@Autowired
	private IDoctorServi doctorServi;
	
	@Autowired
	private IPacienteServi pacienteServi;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPruebaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		// Ingresar 2 pacientes y 2 doctores
//		Doctor d1 = new Doctor();
//		d1.setCedula("1755564779");
//		d1.setNombre("Arturo");
//		d1.setApellido("Estrada");
//		d1.setFechaNacimiento(LocalDateTime.of(1989,  Month.AUGUST, 8, 12, 45));
//		d1.setNumeroConsultorio("E-11");
//		d1.setGenero("Masculino");
//		
//		this.doctorServi.insertarDoctor(d1);
//		
//		Doctor d2 = new Doctor();
//		d2.setCedula("1744634708");
//		d2.setNombre("Violeta");
//		d2.setApellido("Pérez");
//		d2.setFechaNacimiento(LocalDateTime.of(1974,  Month.DECEMBER, 8, 12, 45));
//		d2.setNumeroConsultorio("F-09");
//		d2.setGenero("Femenino");
//		
//		this.doctorServi.insertarDoctor(d2);
//		
//		Paciente p1 = new Paciente();
//		p1.setCedula("1789933591");
//		p1.setNombre("Ruben");
//		p1.setApellido("Piqueras");
//		p1.setFechaNacimiento(LocalDateTime.of(1998,  Month.JUNE, 8, 12, 45));
//		p1.setCodigoSeguro("0000-0000-0001");
//		p1.setEstatura(1.73);
//		p1.setPeso(56.0);
//		p1.setGenero("Masculino");
//		
//		this.pacienteServi.insertarPaciente(p1);
//		
//		Paciente p2 = new Paciente();
//		p2.setCedula("1799564862");
//		p2.setNombre("Manuel");
//		p2.setApellido("Barreiro");
//		p2.setFechaNacimiento(LocalDateTime.of(1968,  Month.MARCH, 8, 12, 45));
//		p2.setCodigoSeguro("0000-0000-0002");
//		p2.setEstatura(1.8);
//		p2.setPeso(58.0);
//		p2.setGenero("Femenino");
//	
//		this.pacienteServi.insertarPaciente(p2);
//		
		// Actualizar 1 paciente y 1 doctor
		Doctor da = new Doctor();
		da.setId(1);
		da.setCedula("1755564779");
		da.setNombre("Arturo");
		da.setApellido("Estrada");
		da.setFechaNacimiento(LocalDateTime.of(1989,  Month.AUGUST, 8, 12, 45));
		da.setNumeroConsultorio("E-11");
		da.setGenero("Masculino");
		
		this.doctorServi.actualizarDoctor(da);
		
		Paciente pa = new Paciente();
		pa.setCedula("1789933591");
		pa.setNombre("Ruben");
		pa.setApellido("Piqueras");
		pa.setFechaNacimiento(LocalDateTime.of(1998,  Month.JUNE, 8, 12, 45));
		pa.setCodigoSeguro("0000-0000-0001");
		pa.setEstatura(1.73);
		pa.setPeso(56.0);
		pa.setGenero("Masculino");
		
		this.pacienteServi.insertarPaciente(pa);
		
		// Funcionalidad agendamiento cita medic
		
		this.gestorCitaServi.agendamientoCitaMedica("123", LocalDateTime.of(2023,  Month.FEBRUARY, 8, 12, 45), new BigDecimal("25.0"), "Hospital IESS", "Pérez", "0000-0000-0002");
	
		//this.gestorCitaServi.agendarCitaMedica("67", LocalDateTime.of(2022,  2, 20, 10, 15), new BigDecimal(33.5), "Condado", "1755564779", "1799564862");
	
		this.gestorCitaServi.resultadoCita("67", "Gripe", "Paracetamol", LocalDateTime.of(2022,  3, 20, 10, 15));
	
		this.gestorCitaServi.reportePaciente(LocalDateTime.of(1950,  Month.FEBRUARY, 8, 12, 45), "Femenino");
	}

}
