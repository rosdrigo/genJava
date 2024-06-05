package src;

import java.util.Scanner;

public class JavaGenCond2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número : ");
		numero = sc.nextInt();

		sc.close();

		if (numero >= 0 && numero % 2 == 0) {
			System.out.printf("O número %d é par e positivo", numero);

		} else if (numero < 0 && numero % 2 == 0) {

			System.out.printf("O número %d é par e negativo", numero);

		} else if (numero >= 0 && numero % 2 != 0) {

			System.out.printf("O número %d é ímpar e positivo", numero);
			
		} else if (numero < 0 && numero % 2 != 0) {

			System.out.printf("O número %d é ímpar e negativo", numero);
		}

	}

}
