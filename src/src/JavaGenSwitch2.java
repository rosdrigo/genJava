package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGenSwitch2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		String colaboradores;
		int codigoCargo;
		float salario;
		
		
		System.out.println("Digite o nome do colaborador: ");
		colaboradores = sc.nextLine();
		
		System.out.println("Digite o código do cargo do Colaborador: ");
		codigoCargo = sc.nextInt();
		
		System.out.println("Digite o seu salário: ");
		salario = sc.nextFloat();
		
		switch(codigoCargo) {
		
		   case 1: {
	            
	            salario = salario+( 10* salario)/100;
	            System.out.printf("Nome do colaborador: %s\n",colaboradores);
	            System.out.printf("Cargo: Gerente\n");
	            
	            System.out.printf("Salário: R$ %.2f",salario);
	            break;
	        }
	        case 2: {
	        	salario = salario+( 7* salario)/100;
	            System.out.printf("Nome do colaborador: %s\n",colaboradores);
	            System.out.printf("Cargo: Vendedor\n");
	            
	            System.out.printf("Salário: R$ %.2f",salario);
	            break;
	        }
	        case 3: {
	        	salario = salario+( 9* salario)/100;
	            System.out.printf("Nome do colaborador: %s\n",colaboradores);
	            System.out.printf("Cargo: Supervisor\n");
	            
	            System.out.printf("Salário: R$ %.2f",salario);
	            break;
	        }
	        case 4: {
	        	salario = salario+( 6* salario)/100;
	            System.out.printf("Nome do colaborador: %s\n",colaboradores);
	            System.out.printf("Cargo: Motorista\n");
	            
	            System.out.printf("Salário: R$ %.2f",salario);
	            break;
	        }
	        case 5: {
	        	salario = salario+( 5* salario)/100;
	            System.out.printf("Nome do colaborador: %s\n",colaboradores);
	            System.out.printf("Cargo: Estoquista\n");
	            
	            System.out.printf("Salário: R$ %.2f",salario);
	            break;
	        }
	        case 6: {
	        	salario = salario+( 6* salario)/100;
	            System.out.printf("Nome do colaborador: %s\n",colaboradores);
	            System.out.printf("Cargo: Gerente\n");
	            
	            System.out.printf("Salário: R$ %.2f",salario);
	            break;
	        }
	        default:{
	            System.out.println("Colaborador não encontrado");
	        }
		
		
		
		sc.close();
				

	}

}
}
