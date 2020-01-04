//8. Diseñe un programa que dada una cantidad a pagar y el dinero con el que se paga, devuelva desglosado en billetes y monedas el dinero que sobr
//Rosana
package Utilidades.mates;
import java.util.Scanner;
public class T4EJ8 {

	public static class CalcularDesglose
	{
		int billete500, billete200, billete100, billete50, billete20, billete10, billete5;
		int moneda2, moneda1, moneda50, moneda20, moneda10, moneda5, moneda02, moneda01;
		//Algoritmo greedy
	
		public double billete500 (double cantidad)
		{
			while(cantidad/500 >=1) {
				billete500++;
				cantidad=cantidad-500;
			}
			System.out.println("Billetes de 500 € : " + billete500);
			
			return cantidad;
		}
		public double billete200 (double cantidad) 
		{
			while(cantidad/200 >=1) {
				cantidad=cantidad-200;
				billete200++;
			}
			System.out.println("Billetes de 200 € : " + billete200);
			return cantidad;
		}
		public double billete100 (double cantidad) 
		{
			while(cantidad/100 >=1) {
				cantidad=cantidad-100;
				billete100++;
			}
			System.out.println("Billetes de 100 € : " + billete100);
			return cantidad;
		}
		public double billete50 (double cantidad) 
		{
			while(cantidad/50 >=1) {
				cantidad=cantidad-50;
				billete50++;
			}
			System.out.println("Billetes de 50 € : " + billete50);
			return cantidad;
		}
		public double billete20 (double cantidad) 
		{
			while(cantidad/20 >=1) {
				cantidad=cantidad-20;
				billete20++;
			}
			System.out.println("Billetes de 20 € : " + billete20);
			return cantidad;
		}
		public double billete10 (double cantidad) 
		{
			while(cantidad/50 >=1) {
				cantidad=cantidad-50;
				billete10++;
			}
			System.out.println("Billetes de 10 € : " + billete10);
			return cantidad;
		}
		public double billete5 (double cantidad) 
		{
			while(cantidad/5 >=1) {
				cantidad=cantidad-5;
				billete5++;
			}
			System.out.println("Billetes de 5 € : " + billete5);
			return cantidad;
		}
		public double moneda2 (double cantidad) 
		{
			while(cantidad/2 >=1) {
				cantidad=cantidad-2;
				moneda2++;
			}
			System.out.println("Monedas de 2 € : " + moneda2);
			return cantidad;
		}
		public double moneda1 (double cantidad) 
		{
			while(cantidad/1 >=1) {
				cantidad=cantidad-1;
				moneda1++;
			}
			System.out.println("Monedas de 1 € : " + moneda1);
			return cantidad;
		}
		public double moneda50 (double cantidad) 
		{
			while(cantidad/0.50 >=1) {
				cantidad=cantidad-0.50;
				moneda50++;
			}
			System.out.println("Monedas de 50 cts: " + moneda50);
			return cantidad;
		}
		public double moneda20 (double cantidad) 
		{
			while(cantidad/0.20 >=1) {
				cantidad=cantidad-0.20;
				moneda20++;
			}
			System.out.println("Monedas de 20 cts: " + moneda20);
			return cantidad;
		}
		public double moneda10 (double cantidad) 
		{
			while(cantidad/0.10 >=1) {
				cantidad=cantidad-0.10;
				moneda10++;
			}
			System.out.println("Monedas de 10 cts: " + moneda10);
			return cantidad;
		}
		public double moneda5 (double cantidad) 
		{
			while(cantidad/0.5 >=1) {
				cantidad=cantidad-0.5;
				moneda5++;
			}
			System.out.println("Monedas de 5 cts: " + moneda5);
			return cantidad;
		}
		public double moneda02 (double cantidad) 
		{
			while(cantidad/0.02 >=1) {
				cantidad=cantidad-0.02;
				moneda02++;
			}
			System.out.println("Monedas de 2 cts: " + moneda02);
			return cantidad;
		}
		public double moneda01 (double cantidad) 
		{
			while(cantidad/0.01 >=1) {
				cantidad=cantidad-0.01;
				moneda1++;
			}
			System.out.println("Monedas de 1 cts: " + moneda01);
			return cantidad;
		}
			
			
		}

	
	public static void main (String args[])
	{
	Scanner teclado = new Scanner(System.in);
	//Instanciamos la clase
	CalcularDesglose Operacion1= new CalcularDesglose();
	System.out.println("Introduzca la cantidad total");
	double cantidad= teclado.nextDouble();
	

	//Concatenación de métodos
	Operacion1.moneda01(Operacion1.moneda02(Operacion1.moneda5(Operacion1.moneda10(Operacion1.moneda20(Operacion1.moneda50(Operacion1.moneda1(Operacion1.moneda2(Operacion1.billete5(Operacion1.billete10(Operacion1.billete20(Operacion1.billete50(Operacion1.billete100(Operacion1.billete200(Operacion1.billete500(cantidad)))))))))))))));
	
	}
}
