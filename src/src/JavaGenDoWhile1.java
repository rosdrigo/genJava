package src;

import java.util.Scanner;

public class JavaGenDoWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				 /*⦁	Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
				  *  Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
				  */

			
			int numero=0, positivo=0;
			
			do{
				System.out.println("Digite um número: ");
				numero = sc.nextInt();
				
				if(numero>0) {
					
					positivo+=numero; //pegou todos os positivos e salvou pra adicionar ao numero o valor total
				}					
			}while(numero!=0); //enquanto for diferente de zero ele continua fazendo o while mas quando chega o 0 ele para
			
			System.out.printf("A soma dos números positivos é: %d",positivo);
					
				
			sc.close();
				
				
			}}
			
	

