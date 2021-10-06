/*
 * Querido programador:
 * Cuando escribi este codigo, solo Dios y yo sabiamos como funcionaba.
 * Ahora, Solo Dios lo sabe!!!
 * Asi que, si esta tratando de 'optimizar' esta rutina y fracasa (seguramente),
 * por favor, incremente el siguiente contador como una advertencia para el
 * siguiente colega:
 * totalHorasPerdidasAqui = 55
 */
/**
 * @since 13 jun. 2021
 * @user IVANB
 * @name iDAO.java
 * @package negocio.dao
 * @project Logistica-DAO
 */
package negocio.dao;

import java.util.ArrayList;

/**
 * @author IVANB
 *
 */
public interface iDAO<T> {

	public boolean add(T elemento);

	public Object get(Object elemento);

	public boolean save();

	public boolean delete();

	public ArrayList<T> getLista();

	public T findId(long l);
}
