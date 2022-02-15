package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaServi {
	void  agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String apellidoDoctor, String codigoSeguroPaciente);
}
