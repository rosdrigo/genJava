package src;

import java.util.Locale;
import java.util.Scanner;

public class JavaGenSwitch1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigo, quantidade;
        float total;
        
        System.out.println("Código do produto: ");
        codigo = sc.nextInt();
        System.out.println("Quantidade: ");
        quantidade = sc.nextInt();
        
        switch (codigo) {
        case 1: {
            System.out.println("Produto: Cachorro-quente");
            total = quantidade * 10;
            System.out.printf("Valor total: R$ %.2f", total);
            break;
        }
        case 2: {
            System.out.println("Produto: X-Salada");
            total = quantidade * 15;
            System.out.printf("Valor total: R$ %.2f", total);
            break;
        }
        case 3: {
            System.out.println("Produto: X-Bacon");
            total = quantidade * 18;
            System.out.printf("Valor total: R$ %.2f", total);
            break;
        }
        case 4: {
            System.out.println("Produto: Bauru");
            total = quantidade * 12;
            System.out.printf("Valor total: R$ %.2f", total);
            break;
        }
        case 5: {
            System.out.println("Produto: Refrigerante");
            total = quantidade * 8;
            System.out.printf("Valor total: R$ %.2f", total);
            break;
        }
        case 6: {
            System.out.println("Produto: Suco de laranja");
            total = quantidade * 13;
            System.out.printf("Valor total: R$ %.2f", total);
            break;
        }
        default:
            System.out.println("Opção inválida.");
        }
        
       
        
        sc.close();
    }
}
