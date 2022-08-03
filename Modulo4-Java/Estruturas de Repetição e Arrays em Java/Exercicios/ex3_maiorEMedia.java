/*
 * Faça um programa que leia 5 números inteiros e mostre o maior e a media desses numeros.
 */
import java.util.Scanner;

public class ex3_maiorEMedia {

    public static void main(String[] args) {
        int maior = 0;
        int media = 0;
        int soma = 0;
        int cont = 0;
        int numero;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite 5 números inteiros: ");
            while (cont < 5) {
                numero = sc.nextInt();
                if (numero > maior) {
                    maior = numero;
                }
                soma = soma + numero;
                cont++;
            }
        }
        media = soma / 5;
        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + media);
    }
    
}
