package com.lucas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.lucas.ultis.AbstractEntity;

@Table 
@Entity
@SequenceGenerator(name = "noticia",sequenceName = "noticia_seq",allocationSize = 1)
public class Noticia extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@OneToMany(cascade=CascadeType.REMOVE)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(
		name ="noticia_comenario",
		joinColumns = @JoinColumn(name = "noticia_id"),
		inverseJoinColumns = @JoinColumn(name = "comentario_id")
	)
	private List<Comentario> listaComentario;
	
	private String titulo;
	private String texto;
	
	private Date date;
	
	//	BufferedImage imagem = ImageIO.read(new File("mariabonita.gif"));
	// fazer algo com a imagem...
	//	ImageIO.write(imagem, "PNG", new File("mariabonita.png"));
//	private BufferedImage imagem;
	
	public List<Comentario> getListaComentario() {
		return listaComentario;
	}

	public void setListaComentario(List<Comentario> listaComentario) {
		this.listaComentario = listaComentario;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Noticia(Integer id){
		super();
		this.id = getId();
	}
	
	public Noticia(){
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(Integer idNoticia) {
		this.id= idNoticia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public BufferedImage getImagem() {
//		return imagem;
//	}
//
//	public void setImagem(BufferedImage imagem) {
//		this.imagem = imagem;
//	}
	
	
	
}
