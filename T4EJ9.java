	//9. Implemente un subprograma que realice la serie de Fibonacci, que es: Fibonacci (1)= Fibonacci (2)=1 N > 2 Fibonacci (n)= Fibonacci (n-1) + Fibonacci (n-2)
	//Rosana

import java.util.Scanner;
public class T4EJ9 
{
public static class Fibonacci 
{
	public int calcularFibonacci(int num1)
	{
		//Comprobamos si es menor a 1
		if (num1>1) {
			//Función
		       return (num1-1) + (num1-2);
		}
		//Comprobamos si es 1 ó 0

		else {
			System.out.println("Número no válido");
			return num1;
		}
	}
	
}

//Main 

public static void main (String args[])
{
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("¿Hasta qué número quieres calcular la serie?");
	int num1 = teclado.nextInt(); //Caso base
	//Instanciamos la clase
	Fibonacci serie = new Fibonacci ();  
	System.out.println("El resultado de la serie es :"+serie.calcularFibonacci(num1));
}
}