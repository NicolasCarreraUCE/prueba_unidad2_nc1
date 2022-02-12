package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaServi {
	void agendamientoCitaMedica(String numeroDeCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	void actualizaciónCitaMedica(String numeroDeCita, String diagnostico, LocalDateTime fechaProximaCita);
	void reporteDePacientes(LocalDateTime fecha, String genero);
}
