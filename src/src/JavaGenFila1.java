package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JavaGenFila1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		int tarefa = -1;
		String mensagem = ("""
				
				*******************************************************************************************************

				SISTEMA BANQUINHO DA PRAÇA PARA ORGANIZAÇÃO DE CLIENTES v1.0

				 USE A NUMERAÇÃO PARA INFORMAR O QUE DESEJA FAZER

					1: Adicionar um novo Cliente na fila. 
					2: Listar todos os Clientes.
					3: Retirar Cliente da fila
					0: Sair

				*******************************************************************************************************

				 DIGITE O NÚMERO DA TAREFA:
											""");
		
	
		
		while (tarefa != 0) {
			System.out.println(mensagem);
			tarefa = sc.nextInt();
			
			mensagem = """
					USE A NUMERAÇÃO PARA INFORMAR O QUE DESEJA FAZER

					1: Adicionar um novo Cliente na fila. 
					2: Listar todos os Clientes.
					3: Retirar Cliente da fila
					0: Sair
					""";

			if (tarefa == 1) {

				System.out.printf("\nDigite o Nome do Cliente: ");
				sc.skip("\\R?");
				String nomeCliente = sc.nextLine();
				
				fila.add(nomeCliente);
				System.out.println("Cliente Adicionado!\n");

			} else if (tarefa == 2) {

				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!\n ");

				} else {
					System.out.println("Lista de Clientes na Fila:\n");
					for (String nomeCliente : fila) {
						System.out.println(nomeCliente + "\n");}
				}

			} else if (tarefa == 3) {

				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia! ");
				} else {
					System.out.println("Lista de Clientes na Fila:\n");
					for (String nomeCliente : fila) {
						System.out.println(nomeCliente + "\n");}
					fila.poll();
					System.out.println("O Cliente foi Chamado ");
				}
			}else if (tarefa ==0) {
				System.out.println("Programa Finalizado!");
				
			}else {
				
				System.out.println("Opção inválida.Escolha uma opção entre 1 e 3 ou 0 para sair.\n ");
			}
		}sc.close();
		
		
		
	}
}
