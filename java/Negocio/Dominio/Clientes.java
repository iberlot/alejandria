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
 * @name Ciientes.java
 * @package Negocio.Dominio
 * @project Alejandria
 */
package Negocio.Dominio;

/**
 * @author IVANB
 *
 */
public class Clientes extends Personas {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = -250430126235867482L;
	
	private String email;
	/**
	 * 
	 */
	public Clientes() {
		// TODO Auto-generated constructor stub
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

}
