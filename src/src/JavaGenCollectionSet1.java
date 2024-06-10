package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaGenCollectionSet1 {

	public static void main(String[] args) {

		Set<Integer> listaNumeros = new HashSet<>();    //Declaração do  arraylist ~ ESTA É LISTA ~

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar:");
		int numeros = sc.nextInt();

		listaNumeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));   // cria uma lista sem criar varios add --addAll(Arrays.asList()

		for (int i = 0; i < listaNumeros.size(); i++) {

			if (listaNumeros.contains(numeros)) {      //Contains----- ele procura o elemento e retorna como verdadeiro 

				System.out.printf("O número %d foi encontrado!", numeros);

				return;

			}
			
		}
		System.out.printf("O número %d nao foi encontrado!", numeros);

		sc.close();

	}

}
