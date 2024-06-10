package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaGenCollection1 {

	public static void main(String[] args) {
		
		/* Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
		 *  O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
		 *   Em seguida, faça o que se pede:
			Mostre na tela todas as cores que foram adicionadas. 
			Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
*/

		ArrayList<String> escolhaCores = new ArrayList<String>(); //Declaração do  arraylist ~ ESTA É LISTA ~
		
		
		Scanner sc = new Scanner(System.in);
		
	
		
		for(int i = 0; i< 5;i++) {
			
			
			System.out.printf("Digite sua %dº Cor: ",i+1);
			String cor = sc.next();
			escolhaCores.add(cor);
			
			
			
		}
		
		Collections.sort(escolhaCores);
		
		System.out.println("\nListar todas as cores: " + escolhaCores);
		
		
		sc.close();

	}

}
