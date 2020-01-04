	//11. Escriba una función llamada potencia que tenga de argumentos de entrada x y n, devuelva x elevado a n. El argumento x es de tipo double y el argumento n es de tipo int.
	//Rosana

import java.util.Scanner;

public class T4EJ11 {
	
	public static class potenciar
	{
		public double potencia(double x, int n) 
		{
			return Math.pow(x, n) ;
			/*Otra opción
			  for(int i = 1; i <= num1; i++) {
	          resultado = x;
	          }
	          return resultado;*/
		}
	}

	public static void main (String args[])
	{
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca la base");
	int num1= teclado.nextInt();
	System.out.println("Introduzca el exponente");
	int num2= teclado.nextInt();
	
	//Instanciamos la clase
	potenciar Potencia1 = new potenciar ();
	System.out.println("El resultado de la potencia es : "+Potencia1.potencia(num1, num2));
	}
}
