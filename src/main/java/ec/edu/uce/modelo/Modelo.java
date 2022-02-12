package ec.edu.uce.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "modelo")
public class Modelo {

	@Id
	@Column(name = "model_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_modelo")
	@SequenceGenerator(name = "seq_modelo", sequenceName = "seq_modelo", allocationSize = 1)
	private Integer id;

	// Uno a Muchos
	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ModeloDetalle> detalleMucho;
	
	// Uno a uno
	@OneToOne(mappedBy = "ciudadano", cascade=CascadeType.ALL)
	private ModeloDetalle detalleUno;
	
	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
