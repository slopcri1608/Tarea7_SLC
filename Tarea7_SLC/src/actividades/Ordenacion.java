package actividades;

/**
 * Esta clase ordena los valores de una matriz, los intercambia y los muestra
 * @author Salvador López Criado
 * @version 1.0
 */

public class Ordenacion {
	
	private final Ejercicio2 actividad3;

	/**
	 * Inicializa la clase igualando una variable local al parametro introducido. 
	 * @param ejercicio2 Viene dado por defecto.
	 */
	public Ordenacion(Ejercicio2 ejercicio2) {
		actividad3 = ejercicio2;
	}
	/**
	 * Este método ordena una matriz de números enteros en orden descendente utilizando el algoritmo de ordenamiento de selección.
	 * @param array La matriz a usar.
	 */
	public void ordenarMatriz(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			intercambiar(array, i, maxValue);
			mostrarMatriz(array);
		}
	}
	/**
	 * Este método ordena una matriz de números enteros en orden ascendente utilizando el algoritmo de ordenamiento de burbuja. 
	 * @param numbers La matriz que vamos a usar.
	 * @return Devuelve los numeros de la matriz.
	 */
	public int[] ordenarMatriz2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}
	/**
	 * Este método imprime la matriz por pantalla
	 * @param array La matriz que vamos a usar.
	 */
	public void mostrarMatriz(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}
	/**
	 * Este método intercambia los valores de dos elementos de la matriz utilizando una variable auxiliar "value".
	 * @param array La matriz que vamos a usar.
	 * @param a La posicion de la matriz que queremos intercambiar.
	 * @param b La posicion dela matriz que queremos intercambiar.
	 */
	public void intercambiar(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}