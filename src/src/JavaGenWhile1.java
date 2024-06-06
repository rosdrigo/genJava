package src;

import java.util.Scanner;

public class JavaGenWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	/* ⦁	Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e
	 *  mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
	 *   A leitura dos dados deve ser finalizada ao digitar uma idade negativa 
	*/
	 
		
		int idade=0, menor21 =0, maior50=0;
		
		while(idade>=0){
			System.out.println("Digite uma idade");
			idade = sc.nextInt();
			
			if(idade<21 && idade >0){
				menor21++;
								
			}else if(idade>50){
				maior50++;
				
			}
			
		}
		sc.close();
		
		System.out.printf("Total de pessoas menores de 21 anos: %d \nTotal de pessoas maiores de 50 anos:%d",menor21,maior50);
		
	
	
	
	
	
	
	
	
	
	
	}}