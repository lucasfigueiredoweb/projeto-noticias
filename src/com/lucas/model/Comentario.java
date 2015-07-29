package com.lucas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.lucas.ultis.AbstractEntity;

@Entity
@Table(name="comentario")
@SequenceGenerator(name = "comentario_id", sequenceName = "comentario_seq", allocationSize = 1)
public class Comentario extends AbstractEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="comentario_id")
	private Integer id;
	
	private String titulo;
	private String texto;
	private Date data;
	
	/**
	 * @param id
	 */
	public Comentario(Integer id){
		super();
		this.id = getId();
	}
	
	public Comentario(){
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(Integer idComentario) {
		this.id= idComentario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
