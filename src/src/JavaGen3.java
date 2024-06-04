package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGen3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o seu salário bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Digite o valor do seu adicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.println("Digite o valor das suas horas extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.println("Digite o valor dos seus descontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5)- descontos;
		
		System.out.printf("Este é o valor do seu salário líquido: R$ %.2f",salarioLiquido);
		
				
		
		sc.close();


	}

}
