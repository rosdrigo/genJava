package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGenSwitch4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod;
		float saldo = 1000.00f;
		float saldofinal, saque, deposito;

		System.out.println("Operação: ");
		cod = sc.nextInt();

		switch (cod) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;

		case 2:
			
			System.out.println("Valor: ");
			saque = sc.nextFloat();
			if (saldo < saque) {
				System.out.println("Saldo insuficiente");
			} else {
				saldofinal = saldo - saque;
				System.out.println("Operação - Saque");
				System.out.printf("Novo Saldo: R$ %.2f", saldofinal);
			}
			break;

		case 3:
			
			System.out.println("Valor: ");
			deposito = sc.nextFloat();
			saldofinal = saldo + deposito;
			System.out.println("Operação - Depósito");
			System.out.printf("Novo Saldo: R$ %.2f", saldofinal);
			break;
		case 4:
			System.out.println("Valor: ");
			saldofinal = sc.nextFloat();
			System.out.println("Operação Inválida!");
			break;

		}
		sc.close();

	}
}