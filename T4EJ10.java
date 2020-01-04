	//10. Realice mediante funciones recursivas un programa que traslade un número entero en base diez a cualquier otra base.
	//Rosana

import java.util.*;
public class T4EJ10 {
	
	//Pasar de decimal a binario   
	public static int decimaltobinario(int x)
	{
	    int rdo;
	    if(x<2){ //el caso base (es el que para la recursividad)
	    rdo=x;
	    }
	    else {
	    rdo= decimaltobinario(x/2)*10+x%2;
	    }
		return rdo;
	    }
	// Para cualquier otra base
	public static int decimaltootra (int x, int b)
	{
	    int rdo;
	    if(x<b)
	    rdo =x;
	    else
	    rdo=decimaltootra(x/b, b) *10 +x%2;
	    return rdo;
	}

	// Pasar como string para bases superiores a 10
	public static String decimaltootras (int x, int b)
	{
	    String rdo=""; //Cadena en blanco
	    if(x<b)
	    //Si resultado es menor a 10 queremos tener una letra,
	    rdo=rdo+ (char) ((x<10)? x+'0' : (x-10+'A'));
        else rdo=rdo+decimaltootras(x/b, b)+(char)((x%b<10)? x%b+'0' : x%b-10+'A');
        return rdo;
	}

	public static void main(String[] args) {
	    
	    Scanner teclado=new Scanner(System.in);
	    {
	    int x=0, y=0;
	    System.out.println("introduce el número");
	    x= teclado.nextInt();
	    System.out.println("introduce la base");
	    y= teclado.nextInt();
	    System.out.println(decimaltobinario(x));
	    System.out.println(decimaltootra(x, y));
	    System.out.println(decimaltootras(x, y));


	    }
	}
	}

