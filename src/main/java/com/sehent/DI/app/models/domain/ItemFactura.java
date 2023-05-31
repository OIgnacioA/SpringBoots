package com.sehent.DI.app.models.domain;

public class ItemFactura {
	private Producto producto;
	private Integer canttidad;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCanttidad() {
		return canttidad;
	}

	public void setCanttidad(Integer canttidad) {
		this.canttidad = canttidad;
	}
}
