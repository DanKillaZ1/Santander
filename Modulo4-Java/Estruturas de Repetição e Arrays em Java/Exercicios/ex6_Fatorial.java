/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */
import java.util.Scanner;

public class ex6_Fatorial {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro: ");
            int numero = sc.nextInt();
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("Fatorial de " + numero + " é " + fatorial);
        }
    }

    
}
