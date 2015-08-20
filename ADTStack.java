/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Interface Stack:
 *Esta clase gen�rica �nicamente contiene los m�todos gen�ricos a implementar en la controladora 
 *de la stack.
 * @param <P>: Este par�metro permite establecer el tipo de dato con el que se desea trabajar la 
 * Stack.
 **/
public interface ADTStack<E>{
	/**
	 *M�todo: empty()
	 *Funcionalidad: Es el encargado de limpiar la pila.
	 */
	public void empty();
	/**
	 * M�todo: isEmpty()
	 * Funcionalidad: Este m�todo est� encargado de revisar 
	 * si la pila se encuentra vac�a.
	 * @return true: vac�a / false: No lo est�
	 */
	public boolean isEmpty();
	/**
	 * M�todo: push(E x);
	 * @param x: Valor a almacenar en la pila
	 * Funcionalidad: Es encargado de guardar en la pila el valor ingresado
	 * como par�metro.
	 * 
	 */
	public void push(E x) ;
	/**
	 * M�todo: pop()
	 * Funcionlidad: 
	 * Es encargado de sacar de la pila el �ltimo valor guardado y lo borra de la pila.
	 * @return E
	 * @throws Exception
	 */
	public E pop() throws Exception;
	/**
	 * M�todo: size()
	 * Funcionalidad:
	 * Retorna el tama�o actual de la pila.
	 * @return int
	 */
	public int size();
	/**
	 * M�todo: peek()
	 * Funcionalidad:
	 * Retorna el �ltimo valor de la pila sin borrarlo de la misma.
	 * @return E
	 * @throws Exception
	 */
	public E peek() throws Exception;
	
}
