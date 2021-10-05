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
 * @name Editoriales.java
 * @package negocio.dominio
 * @project Alejandria
 */
package negocio.dominio;

import java.io.Serializable;

/**
 * @author IVANB
 *
 */
public class Editoriales implements Serializable {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = 2404080550725203549L;
	
	private int id;
	private String nombre;
	private String direccion;
	private String web;
	private String email;
	private long telefono;
	
	/**
	 * 
	 */
	public Editoriales() {
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
	 * @return el campo direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion El parametro direccion para setear
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return el campo web
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * @param web El parametro web para setear
	 */
	public void setWeb(String web) {
		this.web = web;
	}

	/**
	 * @return el campo email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email El parametro email para setear
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return el campo telefono
	 */
	public long getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono El parametro telefono para setear
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
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
