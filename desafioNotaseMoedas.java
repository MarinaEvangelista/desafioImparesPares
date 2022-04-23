package dessafioNotaseMoedas;

import java.util.Scanner;

public class desafioNotaseMoedas {

	public static void main(String[] args) {
		double a = 0.00;  //notas
		double b = 0.00; //moedas
		double c = 0.00; //conta
		double result;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		a = sc.nextDouble();
		
		System.out.println("Digite um valor");
		b = sc.nextDouble();	
		
		
			result = (a/b);
			System.out.printf("O valo ficaa: " +0.f + result);
	}
	}
