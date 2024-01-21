package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "factura_detalle")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int id_Libro;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "editorial")
	private String editorial;
	@Column(name = "num_paginas")
	private Double num_Paginas;
	@Column(name = "edicion")
	private String edicion;
	@Column(name = "idioma")
	private String idioma;
	@Column(name = "fecha_publicacion")
	private Date fecha_Publicacion;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tipo_pasta")
	private String tipo_Pasta;
	@Column(name = "ISBN")
	private String isbn;
	@Column(name = "num_ejemplares")
	private Double num_Ejemplares;
	@Column(name = "portada")
	private String portada;
	@Column(name = "presentacion")
	private String presentacion;
	@Column(name = "precio")
	private Double precio;
	

	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_auutor")
	private Autor autor;
	
	public Libro(int id_libro, String titulo, String editorial, Double num_paginas, String edicion, String idioma, Date fecha_publicacion, String descripcion, String tipo_pasta, String isbn, Double num_ejemplares, String portada, String presentacion, Double precio ) {
		this.id_Libro = id_libro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_Paginas = num_paginas;
		this.edicion = edicion;
		this.fecha_Publicacion = fecha_publicacion;
		this.descripcion = descripcion;
		this.tipo_Pasta = tipo_pasta;
		this.isbn = isbn;
		this.num_Ejemplares = num_ejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;	

	}

	public int getId_Libro() {
		return id_Libro;
	}

	public void setId_Libro(int id_Libro) {
		this.id_Libro = id_Libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Double getNumPaginas() {
		return num_Paginas;
	}

	public void setNumPaginas(Double numPaginas) {
		this.num_Paginas = numPaginas;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFechaPublicacion() {
		return fecha_Publicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fecha_Publicacion = fechaPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPasta() {
		return tipo_Pasta;
	}

	public void setTipoPasta(String tipoPasta) {
		this.tipo_Pasta = tipoPasta;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String ISBN) {
		isbn = ISBN;
	}

	public Double getNumEjemplares() {
		return num_Ejemplares;
	}

	public void setNumEjemplares(Double numEjemplares) {
		this.num_Ejemplares = numEjemplares;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id_Libro=" + id_Libro + ", titulo=" + titulo + ", editorial=" + editorial + ", numPaginas="
				+ num_Paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaPublicacion=" + fecha_Publicacion
				+ ", descripcion=" + descripcion + ", tipoPasta=" + tipo_Pasta + ", ISBN=" + isbn + ", numEjemplares="
				+ num_Ejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}
	
	
	
	
	
	
}
	