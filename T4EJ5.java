	//5. Cree una clase prueba que tenga dos métodos (primero y segundo). El método segundo llamará al método primero dos veces, de forma normal y utilizando this. Verifica que ambas llamadas son equivalentes 
	//Rosana


import java.util.Scanner;
public class T4EJ5 
{
	public static int primerMetodo(int num)
	{
		num+=1;
		return num;
	}
	public void  segundoMetodo(int num)
	{
		this.segundoMetodo = primerMetodo;
		
	}
	
	
	//Main
	public static void main (String args[])
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número");
		int num= teclado.nextInt();
				
	}

}
