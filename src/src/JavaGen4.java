package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGen4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, calculo;
		
		System.out.println("Digite o seu primeiro valor: ");
		n1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = sc.nextFloat();
		
		System.out.println("Digite o quarto: ");
		n4 = sc.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		
		
		
		System.out.printf("esta é a diferença dos 4 valores: %.1f",calculo);
		
				
		
		sc.close();


	}

}
