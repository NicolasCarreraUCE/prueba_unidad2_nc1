package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.Modelo;

public interface IModeloRepo {
	void insertar(Modelo modelo);
	void actualizar(Modelo modelo);
	Modelo buscarPorId(Integer id);
	void borrar(Integer id);
	
	List<Modelo> buscarPorLista(String ejemplo);
	
	Modelo buscarPor(String ejemplo);
}
