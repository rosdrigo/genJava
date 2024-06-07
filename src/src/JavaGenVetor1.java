package src;

import java.util.*;

public class JavaGenVetor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetorNumero[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar:");
		int numero = sc.nextInt();

		for (int i = 0; i < vetorNumero.length; i++) {

			if (numero == vetorNumero[i]) {

				System.out.printf("O número %d está localizado na posição: %d ", numero, i);
				return;
			}
		}
		System.out.printf("o número %d Não foi encontrado", numero);

		sc.close();

	}
}
