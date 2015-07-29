package com.lucas.dao;

import com.lucas.model.Noticia;

public class NoticiaDAO extends AbstractDaoImpl<Noticia, Integer>{

	public NoticiaDAO(){
		super();
	}
		
	public Class<Noticia> entityClass() {
		
		return Noticia.class;
	}
	
}
