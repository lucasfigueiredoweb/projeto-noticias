package com.lucas.dao;

import com.lucas.model.Usuario;


public class UsuarioDAO extends AbstractDaoImpl<Usuario, Integer>{

	public UsuarioDAO(){
		super();
	}
	
	@Override
	public Class<Usuario> entityClass() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}
	
}