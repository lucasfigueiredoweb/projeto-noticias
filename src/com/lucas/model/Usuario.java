package com.lucas.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.lucas.ultis.AbstractEntity;

@Table 
@Entity
@SequenceGenerator(name = "usuario", sequenceName = "usuario_seq", allocationSize = 1)
public class Usuario extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String email;
	private String telefone;
	
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="noticia_id")
	private Noticia noticia;
	
	public Usuario(Integer id){
		super();
		this.id = getId();
	}
	public Noticia getNoticia() {
		return noticia;
	}
	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	public Usuario(){
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
