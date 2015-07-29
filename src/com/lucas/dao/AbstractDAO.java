package com.lucas.dao;

import java.util.List;

public interface AbstractDAO<T> {

	void salvar(T entity);
	void atualizar(T entity);
	
	void remover(T entity);
	List<T> listar();
	
	public T buscarPorId(long id);
	
	Class<T> entityClass();
			
}