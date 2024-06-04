package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGen2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); //usei para colocar em "US" assim conseguindo usar o ponto como dividor decimal

		Scanner sc = new Scanner(System.in);

		float nota1, nota2, nota3, nota4, media;

		System.out.println("Digite sua primeira nota: ");
		nota1 = sc.nextFloat();

		System.out.println("Digite sua segunda nota:");
		nota2 = sc.nextFloat();

		System.out.println("Digite sua terceira nota:");
		nota3 = sc.nextFloat();

		System.out.println("Digite sua quarta nota:");
		nota4 = sc.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("Sua média entre as 4 notas é: %.1f", media);

		sc.close();

	}

}
