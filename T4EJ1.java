//Cree un paquete Utilicades.mates con dos clases sumar y potenciar. La clase sumar tendrá un método int suma(int,int) el cual devolverá la suma de dos parámetros introducidos y la clase potenciar tendrá un método int potencia(int, int) el cual devolverá el resultado de elevar el primer parámetro al segundo parámetro. Realice un programa que haga uso de este paquete.
//Rosana

//padre


import java.util.Scanner;

public class T4EJ1{
//Clase suma
public static class sumar
{
	public int suma(int num1, int num2) 
	{
		return num1 + num2;
	}
}

//Clase potencia
public static class potenciar
{
	public double potencia(int num1, int num2) 
	{
		return Math.pow(num1, num2) ;
		/*Otra opción
		  for(int i = 1; i <= num1; i++) {
          resultado = x;
          }
          return resultado;*/
	}
}

//Main 

public static void main (String args[])
{
int opcion=0;
Scanner teclado = new Scanner(System.in);
	do {
		System.out.println("Este programa calcula la suma y/o potencia de dos números. \n Introduzca el primer número");
		int num1= teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		int num2= teclado.nextInt();
		System.out.println(" Escoja su opción: \n 1- Suma \n 2- Potencia \n 0 - Salir");
		opcion= teclado.nextInt();
		switch(opcion) {
		case 1:
			//Instanciamos la clase
			sumar Suma1 = new sumar ();
			System.out.println("El resultado de la suma es :"+Suma1.suma(num1, num2));
			break;
		case 2:
			//Instanciamos la clase
			potenciar Potencia1 = new potenciar ();
			System.out.println("El resultado de la potencia es :"+Potencia1.potencia(num1, num2));
			break;
		default:
			System.out.println("Opción no válida");
		}
	}while(opcion !=0);
	
	
}

}