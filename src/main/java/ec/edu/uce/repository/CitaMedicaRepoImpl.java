package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public CitaMedica buscarCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void actualizarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public void borrarCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarCitaMedica(id));
	}
	
}
