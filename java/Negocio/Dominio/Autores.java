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
 * @name Autores.java
 * @package Negocio.Dominio
 * @project Alejandria
 */
package Negocio.Dominio;

import java.io.Serializable;

/**
 * @author IVANB
 *
 */
public class Autores implements Serializable {
	
	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = -2729655559194018249L;
	
	private int id;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	
	/**
	 * 
	 */
	public Autores() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return el campo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre El parametro nombre para setear
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el campo apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido El parametro apellido para setear
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return el campo nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad El parametro nacionalidad para setear
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return el campo id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id El parametro id para setear
	 */
	public void setId(int id) {
		this.id = id;
	}

	
}
