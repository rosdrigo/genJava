package src;

import java.util.Scanner;

public class JavaGenCond4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palavra1;

		System.out.println("Digite se o animal é vertebrado ou invertebrado: ");
		palavra1 = sc.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {

			System.out.println("Digite se o animal é uma ave ou um mamifero : ");
			palavra1 = sc.nextLine();
			if (palavra1.equalsIgnoreCase("ave")) {

				System.out.println("Digite se o animal é carnivoro ou onivoro:");
				palavra1 = sc.nextLine();
				if (palavra1.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");}

					if (palavra1.equalsIgnoreCase("onivoro")) {
						System.out.println("pomba");}

				
				

			} else if (palavra1.equalsIgnoreCase("mamifero")) {
				System.out.println("Digite se o animal é onivoro ou herbivoro");
				palavra1 = sc.nextLine();

				if (palavra1.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				}

				if (palavra1.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}

			}

		} 
		
		
		else if (palavra1.equalsIgnoreCase("invertebrado")) {

			System.out.println("Digite se o animal é uma inseto ou um anelidio : ");
			palavra1 = sc.nextLine();
			if (palavra1.equalsIgnoreCase("inseto")) {

				System.out.println("Digite se o animal é hematofago ou herbivoro : ");
				palavra1 = sc.nextLine();
				if (palavra1.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");

					if (palavra1.equalsIgnoreCase("herbivoro")) {
						System.out.println("Lagarta");

					}

				}

			} else if (palavra1.equalsIgnoreCase("anelidio")) {
				System.out.println("Digite se o animal é hematofago ou anelidio : ");
				palavra1 = sc.nextLine();

				if (palavra1.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				}

				if (palavra1.equalsIgnoreCase("herbivoro")) {
					System.out.println("Minhoca");
				}

			}
		}
		
		sc.close();
	}
}
