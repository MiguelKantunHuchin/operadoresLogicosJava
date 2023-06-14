package operadoresLogicos;

import java.util.Scanner;

public class ejercicioOperadores {
	public static void main(String[] args) {
		
		/* Los operadores logicos se utilizan para comninar valores booleanos y nos devuelven un resultado verdadeo, falso o nulo*/
		
		// && And
		// || Or
		// ! Not
		
		int a = 5;
		int b = 3;
		
		System.out.println((a == b) && (a > b));

		System.out.println(!(a == b) && (a > b));
		
		System.out.println((a == b) || (a > b));

		
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el primer numero:");
		int num1 = sc.nextInt();
		
		System.out.println("Ingresa el Segundo numero:");
		int num2 = sc.nextInt();
		
			
		if (num1%2==0 && num2%2==0) {
			System.out.println("Los numeros son pares");
		} else if(num1%2==0 && num2%2==1){
			System.out.println("El primer numero es par");
		} else if(num1%2==1 && num2%2==0){
			System.out.println("El segundo numero es par");
		} else {
			System.out.println("Los numeros son impares");
		}
		
		
		sc.close();
		
	}
	
}
