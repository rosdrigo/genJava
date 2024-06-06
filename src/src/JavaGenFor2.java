package src;

import java.util.Scanner;

public class JavaGenFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pares=0, impares=0;
		
		for (int i = 0; i < 10 ; i++) {
			System.out.printf("Digite o %d° Número ",i+1);
			int numero = sc.nextInt();
			
			if(numero%2 ==0) {
				pares++;						
				
			}else {
				impares++;
			}
			
			
			
		}
		
		System.out.printf("Total de número pares: %d \nTotal de número Impares: %d",pares,impares);
		sc.close();
	}

}
