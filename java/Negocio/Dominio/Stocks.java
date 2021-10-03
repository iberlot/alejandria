/*
 * Querido programador:
 * Cuando escribi este codigo, solo Dios y yo sabiamos como funcionaba.
 * Ahora, Solo Dios lo sabe!!!
 * Asi que, si esta tratando de 'optimizar' esta rutina y fracasa (seguramente),
 * por favor, incremente el siguiente contador como una advertencia para el
 * siguiente colega:
 * totalHorasPerdidasAqui = 0
 */
/**
 * @since 3 oct. 2021
 * @user IVANB
 * @name Stocks.java
 * @package Negocio.Dominio
 * @project Alejandria
 */
package Negocio.Dominio;

import java.io.Serializable;

/**
 * @author IVANB
 *
 */
public class Stocks implements Serializable {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = -887752713798236944L;
	
	private Libros libro;
	private Editoriales editorial;
	private int cantidad;
	
	/**
	 * 
	 */
	public Stocks() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return el campo libro
	 */
	public Libros getLibro() {
		return libro;
	}

	/**
	 * @param libro El parametro libro para setear
	 */
	public void setLibro(Libros libro) {
		this.libro = libro;
	}

	/**
	 * @return el campo editorial
	 */
	public Editoriales getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial El parametro editorial para setear
	 */
	public void setEditorial(Editoriales editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return el campo cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad El parametro cantidad para setear
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
