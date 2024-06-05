package src;

import java.util.Scanner;

public class JavaGenCond1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int valorA, valorB, valorC;
		
		
		System.out.println("Digite o primeiro valor: ");
		valorA = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valorB = sc.nextInt();
				
		System.out.println("Digite o terceiro valor: ");		
		valorC = sc.nextInt();
		
		sc.close();
		
			
		if(valorA+valorB>valorC) {
			
			System.out.println("A Soma de A + B é Maior do que C");
					
			
		}else if(valorA+valorB<valorC){
			
			System.out.println("A Soma de A + B é Menor do que C");
			
		}else{
			
			System.out.println("A Soma de A + B é Igual a C");			
			
		}
		
								

	}

}
