package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Modelo;

@Repository
@Transactional
public class ModeloRepoImpl implements IModeloRepo {

	private static final Logger LOG = LoggerFactory.getLogger(ModeloRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Modelo modelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(modelo);
	}

	@Override
	public void actualizar(Modelo modelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(modelo);
	}

	@Override
	public Modelo buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Modelo.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Modelo modeloBorrar = this.buscarPorId(id);
		this.entityManager.remove(modeloBorrar);
	}

	@Override
	public List<Modelo> buscarPorLista(String ejemplo) {
		// TODO Auto-generated method stub
		// JOIN: SELECT f FROM Factura f JOIN f.detalles d WHERE f.fecha <=:fecha
		// WERE: SELECT f FROM Factura f, DetalleFactura d WHERE f = d.factura AND f.fecha <=:fecha
		// FETCH: SELECT f FROM Factura f JOIN FETCH f.detalles d WHERE f.fecha <=:valor
		// Sencialla: SELECT NEW ec.edu.uce.modelo.jpa.FacturaSencilla(f.numero,f.cedula) FROM Factura f JOIN f.detalles d WHERE f.fecha <=:fecha
		TypedQuery<Modelo> myQuery = this.entityManager.createQuery("SELECT f FROM Factura f JOIN FETCH f.detalles d WHERE f.fecha <=:fecha", Modelo.class);
		myQuery.setParameter("valor", ejemplo);
		return myQuery.getResultList();
	}
	
	@Override
	public Modelo buscarPor(String ejemplo) {
		// TODO Auto-generated method stub
		TypedQuery<Modelo> myQuery = this.entityManager.createQuery("", Modelo.class);
		myQuery.setParameter("valor", ejemplo);
		return myQuery.getSingleResult();
	}

}
