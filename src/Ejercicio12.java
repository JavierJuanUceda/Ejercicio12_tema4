/*
* 
* Versión 1
*
* 1/1/2018
*
* Javier Juan Uceda
*/
public class Ejercicio12 {

	public static void main(String[] args) {
		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] numeroscopia = new int[100];
		int contador=0;
		/*
		Bucle que hasta que llegue al final del array ira número por número
		copiando al nuevo array.
		*/
		
		for (contador = 0;contador < numeros.length;contador = contador + 1) {
			numeroscopia[contador]=numeros[contador];

		}// Fin del bucle 

		System.out.println("Los numeros son");
		/*
		Bucle que hasta que llegue al final del array ira número por número
		imprimiendo el antiguo array.
		*/
		
		for (contador = 0;contador < numeros.length;contador = contador + 1) {
			System.out.print(numeros[contador]+" ");

		}// Fin del bucle 

		System.out.println("");
		System.out.println("La copia es");
		/*
		Bucle que hasta que llegue al final del array ira número por número
		imprimiendo el nuevo array.
		*/
		for (contador = 0;contador < numeros.length;contador = contador + 1) {
			System.out.print(numeroscopia[contador]+" ");

		}// Fin del bucle 
	}// Fin del main

}// Fin de la clase