package com.lucas.ultis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.lucas.dao.ComentarioDAO;
import com.lucas.dao.NoticiaDAO;
import com.lucas.dao.UsuarioDAO;
import com.lucas.model.Comentario;
import com.lucas.model.Noticia;
import com.lucas.model.Usuario;


public class TesteUtilAplication {

	public static void main(String[] args) {
		
		Date data = new Date(); 
		SimpleDateFormat df; 
		df = new SimpleDateFormat("dd/MM/yyyy");  
		
		Noticia noticia = new Noticia();
		List<Comentario> listaComentario = new ArrayList<Comentario>();			
		Comentario comentario = new Comentario();
		Usuario usuario = new Usuario();
		
		NoticiaDAO nDao = new NoticiaDAO();
		ComentarioDAO cDao = new ComentarioDAO();
		UsuarioDAO uDao = new UsuarioDAO();
		
		usuario.setEmail("teste@email");
		usuario.setTelefone("098098098");
		uDao.salvar(usuario);
		
		
		comentario.setData(data);
		comentario.setTexto("TEXTO TEXTO");
		comentario.setTitulo("TEXTO TITULO");
		cDao.salvar(comentario);
		
		listaComentario.add(comentario);
		
		noticia.setDate(data);
		noticia.setListaComentario(listaComentario);
		noticia.setTexto("TEXTO TEXTO");
		noticia.setTitulo("TEXTO TITULO");
		nDao.salvar(noticia);
		
		
	}
	
	
}
