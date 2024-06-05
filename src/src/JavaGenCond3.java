package src;

import java.util.Scanner;

public class JavaGenCond3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nomeDoDoador;
		int idade;
		boolean primeiraDoacaoSangue;		

		System.out.println("Digite o seu nome: ");
		nomeDoDoador = sc.nextLine();

		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Primeira doação de sangue? (TRUE OR FALSE) ");
		primeiraDoacaoSangue = sc.nextBoolean();

		
		sc.close();
		
		if(idade>=18 && idade<=59){
			
			System.out.printf("%s está apto para doar sangue!",nomeDoDoador);
			
		}else if(idade>=60 && idade<=69 && primeiraDoacaoSangue != true){
			
			System.out.printf("%s está apto para doar sangue!",nomeDoDoador);
			
		}else {
			
			System.out.printf("%s não está apto para doar sangue!",nomeDoDoador);
			
		}
			
			
			
		

	}

}
