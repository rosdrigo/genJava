package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGen1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextFloat();
				
		System.out.println("Digite o valor do seu abono salarial:");		
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu novo salário com abono é: R$%.2f",novoSalario);
		
		
		sc.close();
				
		
	}

}
