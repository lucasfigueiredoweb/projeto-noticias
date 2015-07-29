package com.lucas.dao;

import com.lucas.model.Comentario;

public class ComentarioDAO extends AbstractDaoImpl<Comentario, Integer>{

	public ComentarioDAO() {
		super();
	}
	
	public Class<Comentario> entityClass(){
		return Comentario.class;
	}
	
}
