	//5. Cree una clase prueba que tenga dos m�todos (primero y segundo). El m�todo segundo llamar� al m�todo primero dos veces, de forma normal y utilizando this. Verifica que ambas llamadas son equivalentes 
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
		System.out.print("Introduce un n�mero");
		int num= teclado.nextInt();
				
	}

}
