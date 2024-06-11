package src;

import java.util.Scanner;
import java.util.Stack;

public class JavaGenPilha1 {
public static void main(String[] args) {
	
	Stack<String> pilha = new Stack<String>();
	Scanner sc = new Scanner(System.in);
	
	String mensagem = ("""
			
			***********************************************************************
			
				 USE A NUMERAÇÃO PARA INFORMAR O QUE DESEJA FAZER

			1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
			2: Listar todos os livros
			3: Retirar livro da pilha 
			0: Sair. 


			***********************************************************************

			 ENTRE COM A OPÇÃO DESEJADA:
										""");
	
	
	int livraria = -1;
	
	while(livraria!=0) {
		System.out.println(mensagem);
		livraria = sc.nextInt();
		
		
		if (livraria == 1) {

			System.out.printf("\nDigite o Nome do Livro: ");
			sc.skip("\\R?");
			String nomeLivro = sc.nextLine();
			
			pilha.push(nomeLivro);
			System.out.println("\nLivro Adicionado!\n");
			
		}else if (livraria == 2) {

			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia!\n ");

			} else {
				System.out.println("Lista de Livros na Pilha:\n");
				for (String nomeLivro : pilha) {
					System.out.println(nomeLivro + "\n");}
			}} else if (livraria == 3) {

				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia! ");
				} else {
					System.out.println("Pilha:\n");
					for (String nomeLivro : pilha) {
						System.out.println(nomeLivro + "\n");}
					pilha.pop();
					System.out.println("Um Livro foi retirado da pilha! ");
				}
			}else if (livraria ==0) {
				System.out.println("Programa Finalizado!");
				
			}else {
				
				System.out.println("Opção inválida.Escolha uma opção entre 1 e 3 ou 0 para sair.\n ");
			}
		
		
		
		
		
		
		
	}
	
	
	
	

}}
