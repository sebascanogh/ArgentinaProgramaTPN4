package programasyarchivos;
import java.util.Scanner;

public class TPN4_Ejercicio1 {
	
	public static void main(String[] args) {
		/*Scanner numero = new Scanner(System.in);//punto 1.b TPN4
		System.out.println("Ingresar 1° numeros: ");
		int num1 = numero.nextInt();
		System.out.println("Ingresar 2° numeros: ");
		int num2 = numero.nextInt();
		System.out.println("Ingresar 3° numeros: ");
		int num3 = numero.nextInt();
		char orden = 'a';
		ordenarnumeros(num1,num2,num3,orden);*/
		ordenarnumeros(18,95,20,'a');
		
	}

	public static void ordenarnumeros(int num1,int num2, int num3, char orden) {
		int mayor = 0, aux1=0, aux2=0;

		if ((num1 > num2) && (num1 > num3)) {

		mayor=num1;

		if (num2 > num3) {

		aux1=num2;

		aux2=num3;

		}else {

		aux1=num3;

		aux2=num2;

		}

		}

		else{

		if ((num2 > num3) && (num2 > num1)) {

		mayor=num2;

		if (num1 > num3) {

		aux1=num1;

		aux2=num3;

		}else {

		aux1=num3;

		aux2=num1;

		}

		}else {

		mayor=num3;

		if (num2 > num1) {

		aux1=num2;

		aux2=num1;

		}else {

		aux1=num1;

		aux2=num2;

		}

		}

		}

		System.out.println("El mayor es: "+mayor);

		int vecOrdenado [] = new int[3];

		if (orden=='a') {

		vecOrdenado[0]=mayor;

		vecOrdenado[1]=aux1;

		vecOrdenado[2]=aux2;

		}else {

		vecOrdenado[0]=aux2;

		vecOrdenado[1]=aux1;

		vecOrdenado[2]=mayor;

		}

		for (int i=0; i< vecOrdenado.length; i++ ) {

		System.out.print(vecOrdenado[i]+"-");

	}

	}

}
