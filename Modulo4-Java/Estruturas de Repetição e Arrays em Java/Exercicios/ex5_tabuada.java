/*
 * Desenvolva um gerados de tabuada de um número inteiro entre 1 e 10.
 * O usuário deverá informar um número inteiro e o programa deverá mostrar a tabuada desse número.
 */
import java.util.Scanner;

public class ex5_tabuada {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro: ");
            int tabuada = sc.nextInt();

            System.out.println("Tabuada de " + tabuada);

            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        }
    }
}
