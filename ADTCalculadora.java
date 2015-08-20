import java.io.FileNotFoundException;

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Interface Stack:
 *Esta clase gen�rica �nicamente contiene los m�todos gen�ricos a implementar en la controladora 
 *de la stack.
 * @param <P>: Este par�metro permite establecer el tipo de dato con el que se desea trabajar la 
 * calculadora Stack.
 **/

public interface ADTCalculadora<P> {
	
	/** 
	 * M�todo: readFile
	 * Funcionalidad: Lectura del archivo de texto, indic�ndole mediante el par�metro la ubicaci�n del mismo
	 * @param file:Direcci�n en el computador que indique la ubicaci�n del archivo de texto a leer.
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;
	/**
	 * M�todo: calcular()
	 * Funcionalidad: PUSH y POP en la stack los valores le�dos como el resultado obtenido de operarlos.
	 * @return: El resultado del c�lculo en double.
	 */
	public double calcular();
}
