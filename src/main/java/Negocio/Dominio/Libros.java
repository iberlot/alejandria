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
 * @name Libros.java
 * @package Negocio.Dominio
 * @project Alejandria
 */
package Negocio.Dominio;

import java.io.Serializable;
import java.util.HashSet;

/**
 * @author IVANB
 *
 */
public class Libros implements Serializable {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = -2064209329800248854L;
	
	private String titulo;
	private String isbn;
	private int paginas;
	private String genero;
	private String edicion;
	private Autores autor;
	private HashSet<Editoriales> editoriales;
	
	/**
	 * 
	 */
	public Libros() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @return el campo titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo El parametro titulo para setear
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return el campo isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn El parametro isbn para setear
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return el campo paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas El parametro paginas para setear
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return el campo genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero El parametro genero para setear
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return el campo edicion
	 */
	public String getEdicion() {
		return edicion;
	}

	/**
	 * @param edicion El parametro edicion para setear
	 */
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	/**
	 * @return el campo autor
	 */
	public Autores getAutor() {
		return autor;
	}

	/**
	 * @param autor El parametro autor para setear
	 */
	public void setAutor(Autores autor) {
		this.autor = autor;
	}

	/**
	 * @return el campo editoriales
	 */
	public HashSet<Editoriales> getEditoriales() {
		return editoriales;
	}

	/**
	 * @param editoriales El parametro editoriales para setear
	 */
	public void setEditoriales(HashSet<Editoriales> editoriales) {
		this.editoriales = editoriales;
	}


}
