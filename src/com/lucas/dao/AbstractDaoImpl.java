package com.lucas.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lucas.ultis.AbstractEntity;

public abstract class AbstractDaoImpl<T extends AbstractEntity, ID extends Serializable> implements AbstractDAO<T>{

	private EntityManagerFactory factory;	
	private EntityManager manager;
	
	public AbstractDaoImpl(){
		this.factory = Persistence.createEntityManagerFactory("barros");
		this.manager = factory.createEntityManager();
	}
	
	public void salvar(T entity){
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
	}
	
	public void atualizar(T entity){
		manager.merge(entity);
	}
	
	public void remover(T entity){
		entity = manager.find(entityClass(), entity.getId());
		manager.remove(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listar(){
		Query query = (Query) manager.createQuery("select c"
				+ "from" + entityClass().getSimpleName() + "c" );
		return ((javax.persistence.Query) query).getResultList();
	}
	
	public T buscarPorId(long id){
		return manager.find(entityClass(), id);
	}
		
	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}		
}
