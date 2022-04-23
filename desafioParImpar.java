package desafioParImpar;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;	
public class desafioParImpar{
	public static void main(String[] args) {
		int a,x,y,z,w,i,p = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 1 número inteiro: ");
		x = sc.nextInt();
		System.out.printf("Digite 1 número inteiro: ");
		y = sc.nextInt();
		System.out.printf("Digite 1 número inteiro: ");
		z = sc.nextInt();
		System.out.printf("Digite 1 número inteiro: ");
		w = sc.nextInt();
		
			for( a =0; a!=x ; a = x ){
			if( x % 2 == 0 ){
				p = x;
				System.out.println("este é par "+x);
				}else {
				i = x;
				System.out.println("este é impar "+x);
					}
		}
		for( a =0; a!=y; a = y ){
			if( y % 2 == 0){
				p = y;
				System.out.println("este é par "+y);				
			}else {
				i = y;
				System.out.println("este é impar "+y);
			}
			for( a =0; a!=z;a = z ){
				if( z % 2 == 0){
				p = z;
				System.out.println("este é par "+z);	
				}else {
				i = z;
				System.out.println("este é impar "+z);
				}
				for( a =0; a!=w;a = w ){
					if( w % 2 == 0){
						p = w;
						System.out.println("este é par "+w);	
					}else {
						i = w;
						System.out.println("este é impar "+w);
					}
				}			 
			}
		}
	}
}