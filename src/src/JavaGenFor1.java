package src;

import java.util.Scanner;

public class JavaGenFor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite o menor número");
		numero1 = sc.nextInt();

		System.out.println("Digite o maior número");
		numero2 = sc.nextInt();

		if (numero1 < numero2) {
			for (int i = numero1; i < numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
		}else{
			System.out.println("O Intervalo do número é inválido, por favor insira as métricas corretas");
		}
		sc.close();
	}

}
