/*
 * crie um vetor de 6 números inteiros e mostre os na ordem inversa
 */
import java.util.Scanner;
public class ex7_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = new int[6];
        int[] vetorInverso = new int[6];
        int cont = 0;
        int cont2 = 0;
        int numero;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite 6 números inteiros: ");
            while (cont < 6) {
                numero = scan.nextInt();
                vetor[cont] = numero;
                cont++;
            }
            for (int i = 5; i >= 0; i--) {
                vetorInverso[cont2] = vetor[i];
                cont2++;
            }
            System.out.println("Vetor invertido: ");
            for (int i = 0; i < 6; i++) {
                System.out.println(vetorInverso[i]);
            }
        }
    }
    
}
