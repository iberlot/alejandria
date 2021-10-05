/**
 * 
 */
package negocio.dominio;

import java.io.Serializable;

/**
 * @author IVANB
 *
 */
public abstract class Personas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -492862629939183971L;

	private String nombre;
	private String apellido;
	/**
	 * se va a tomar como identificador de la persona ya que la posibilidad de que venga una persona con dni duplicado es menor al 2%
	 * En argentina el 8% de la poblacion tien mas de 70 y la cuartaparte de estos se pueden contar como dni duplicados.
	 * 
	 */
	private long dni;
	private long telefono;
	private String password;
	
	/**
	 * 
	 */
	public Personas() {

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
	 * @return el campo dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni El parametro dni para setear
	 */
	public void setDni(long dni) {
		this.dni = dni;
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
	 * @return el campo password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password El parametro password para setear
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
