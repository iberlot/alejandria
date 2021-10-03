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
 * @name Reservas.java
 * @package Negocio.Dominio
 * @project Alejandria
 */
package Negocio.Dominio;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author IVANB
 *
 */
public class Reservas implements Serializable {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = -432220453682086676L;
	
	private int id;
	private Clientes cliente;
	private Administrativos aprobadox;
	private Stocks libro;
	private Calendar fecha;
	private boolean devuelto;
	
	/**
	 * 
	 */
	public Reservas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return el campo cliente
	 */
	public Clientes getCliente() {
		return cliente;
	}

	/**
	 * @param cliente El parametro cliente para setear
	 */
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return el campo aprobadox
	 */
	public Administrativos getAprobadox() {
		return aprobadox;
	}

	/**
	 * @param aprobadox El parametro aprobadox para setear
	 */
	public void setAprobadox(Administrativos aprobadox) {
		this.aprobadox = aprobadox;
	}

	/**
	 * @return el campo libro
	 */
	public Stocks getLibro() {
		return libro;
	}

	/**
	 * @param libro El parametro libro para setear
	 */
	public void setLibro(Stocks libro) {
		this.libro = libro;
	}

	/**
	 * @return el campo fecha
	 */
	public Calendar getFecha() {
		return fecha;
	}

	/**
	 * @param fecha El parametro fecha para setear
	 */
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return el campo devuelto
	 */
	public boolean isDevuelto() {
		return devuelto;
	}

	/**
	 * @param devuelto El parametro devuelto para setear
	 */
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
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
