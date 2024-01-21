package com.distribuida.entities;

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
public class FacturaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura_detalle")
	private int id_Factura_Detalle;
	@Column(name = "cantidad")
	private Double cantidad;
	@Column(name = "subtotal")
	private Double subtotal;

	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_factura")
	private Factura factura;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_libro")
	private Libro libro;
	
	public FacturaDetalle(int id_factura_detalle, Double cantidad, Double subtotal) {
		this.id_Factura_Detalle = id_factura_detalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;

	}

	public int getIdFactura_Detalle() {
		return id_Factura_Detalle;
	}

	public void setIdFactura_Detalle(int id_Factura_Detalle) {
		this.id_Factura_Detalle = id_Factura_Detalle;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFactura_Detalle=" + id_Factura_Detalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	
	
	
	
}
