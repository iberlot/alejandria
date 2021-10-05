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
 * @name Administrativos.java
 * @package negocio.dominio
 * @project Alejandria
 */
package negocio.dominio;

/**
 * @author IVANB
 *
 */
public class Administrativos extends Personas {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = 959568027768785528L;
	
	private int legajo;

	/**
	 * 
	 */
	public Administrativos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return el campo legajo
	 */
	public int getLegajo() {
		return legajo;
	}

	/**
	 * @param legajo El parametro legajo para setear
	 */
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

}
