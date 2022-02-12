package ec.edu.uce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "modelo_detalle")
public class ModeloDetalle {
	
	@Id
	@Column(name = "demo_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_modelo_detalle")
	@SequenceGenerator(name = "seq_modelo_detalle", sequenceName = "seq_modelo_detalle", allocationSize = 1)
	private Integer id;
	
	// Muchos a uno
	@ManyToOne
	@JoinColumn(name = "demo_id_modelo")
	private Modelo modeloMuchos;
	
	// Uno a uno
	@OneToOne
	@JoinColumn(name = "demo_id_modelo")
	private Modelo modeloUno;
}
