/*
 * Faça um programa que peça uma nota, entre zero e dez, mostre uma mensagem de erro caso o usuário digite um valor inválido e continue pedindo até que o usuário digite um valor válido.
 */

import java.util.Scanner;

public class Ex2_nota {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nota;

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10: ");
                nota = sc.nextInt();
            }
        }

    }
}