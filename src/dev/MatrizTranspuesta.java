/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 21/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* DEscripción: Matriz normal y matriz transpuesta.	 *
*****************************************************/

package dev;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MatrizTranspuesta {
	
	static Scanner sc = new Scanner(System.in);
	static int[][] matriz1;
	static int[][] matriz2;

	public static void main(String[] args) {
		
		System.out.println("Programa que muestra la transpuesta de una matriz");
		
		matriz1 = new int [2][3];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				System.out.println("Elemento "+ i + "," + j);
				matriz1[i][j]= sc.nextInt();			
			}	
		}
		
		matriz2 = new int [matriz1[0].length][matriz1.length];
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				matriz2[i][j] = matriz1[j][i]; 
			}
		}
		
		System.out.println(" Se muestra la matriz normal");
		//imprime la primer matriz
		Imprimir(matriz1);
		
		System.out.println("Se muestra la transpuesta de la matriz");
		//imprime la segunda matriz
		Imprimir(matriz2);
		
	}
		
	
	static void Imprimir(int[][] mat) {
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		
	}
	
}
