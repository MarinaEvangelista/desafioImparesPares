package desafioParImpar;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;	
public class desafioParImpar{
	public static void main(String[] args) {
		int a,x,y,z,w,i,p = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 1 n�mero inteiro: ");
		x = sc.nextInt();
		System.out.printf("Digite 1 n�mero inteiro: ");
		y = sc.nextInt();
		System.out.printf("Digite 1 n�mero inteiro: ");
		z = sc.nextInt();
		System.out.printf("Digite 1 n�mero inteiro: ");
		w = sc.nextInt();
		
			for( a =0; a!=x ; a = x ){
			if( x % 2 == 0 ){
				p = x;
				System.out.println("este � par "+x);
				}else {
				i = x;
				System.out.println("este � impar "+x);
					}
		}
		for( a =0; a!=y; a = y ){
			if( y % 2 == 0){
				p = y;
				System.out.println("este � par "+y);				
			}else {
				i = y;
				System.out.println("este � impar "+y);
			}
			for( a =0; a!=z;a = z ){
				if( z % 2 == 0){
				p = z;
				System.out.println("este � par "+z);	
				}else {
				i = z;
				System.out.println("este � impar "+z);
				}
				for( a =0; a!=w;a = w ){
					if( w % 2 == 0){
						p = w;
						System.out.println("este � par "+w);	
					}else {
						i = w;
						System.out.println("este � impar "+w);
					}
				}			 
			}
		}
	}
}