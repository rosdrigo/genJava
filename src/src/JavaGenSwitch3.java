package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGenSwitch3 {

	public static void main(String[] args) {
		 
	       Locale.setDefault(Locale.US);
		        Scanner sc = new Scanner(System.in);
		        float numero1, numero2, operacao;
		        int cod;

		        System.out.println("Digite o 1º número: ");
		        numero1 = sc.nextFloat();

		        System.out.println("Digite o 2º número: ");
		        numero2 = sc.nextFloat();

		        System.out.println("Operação: ");
		        cod = sc.nextInt();

		        switch(cod) {
		        case 1:
		            operacao = numero1 + numero2;
		            System.out.printf("%.1f + %.1f = %.1f",numero1,numero2,operacao);
		            break;
		        case 2:
		            operacao = numero1 - numero2;
		            System.out.printf("%.1f - %.1f = %.1f",numero1,numero2,operacao);
		            break;
		        case 3:
		            operacao = numero1 * numero2;
		            System.out.printf("%.1f * %.1f = %.1f",numero1,numero2,operacao);
		            break;
		        case 4:
		            operacao = numero1 / numero2;
		            System.out.printf("%.1f / %.1f = %.1f",numero1,numero2,operacao);
		            break;

		            default:
		                System.out.println("Operação Inválida!");

		        }


		        sc.close();

		    }

		



}


