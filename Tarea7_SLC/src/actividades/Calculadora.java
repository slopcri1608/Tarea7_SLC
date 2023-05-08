/**
 * 
 */
package actividades;

/**
 * Esta clase es una calculadora simple capaz de sumar,restar,multiplicar y dividir.
 * @author Salvador López Criado
 * @version 1.0
 */
public class Calculadora {
	
	/**
	* Método constructor por defecto
	*/

	public Calculadora(){
        
    }
    /**
     * Este metodo suma dos numeros
     * @param num1 Primer numero introducido por el usuario
     * @param num2 Segundo numero introducido por el usuario
     * @return Devuelve la suma de los dos numeros introducidos por parámetro
     */
    public int suma(int num1,int num2){
        return num1+num2;
    }
    /**
     * Este metodo resta dos numeros
     * @param num1 1er Numero que introduce el usuario
     * @param num2 2º Numero que introduce el usuario
     * @return Devuelve la resta de los dos numeros introducidos
     */
    public int resta(int num1,int num2){
        return num1-num2;
    }
    /**
     * Este metodo multiplica dos numeros
     * @param num1 1er Numero que introduce el usuario
     * @param num2 2º Numero que introduce el usuario
     * @return Devuelve la multiplicacion de los 2 numeros introducidos
     */
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    /**
     * Este metodo divide dos numeros
     * @param num1 1er Numero que introduce el usuario
     * @param num2 2º Numero que introduce el usuario
     * @return Devuelve la division entre los dos numeros
     * @throws ArithmeticException Si el num2 es 0, devuelve una excepcion
     */
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	//private int valor1;
	//private int valor2;
}
