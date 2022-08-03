import java.util.Random;

/*
 * Faça um programa que leia 20 numeros inteiros aleatorios (entre0 e 100) armazene-os em um vetor.
 * ao final mostre os numeros e seus sucessores
 */


public class ex9_NumerosAleatorios {
    public static void main(String[] args){
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = random.nextInt(100);
        }
        System.out.println("Numeros aleatorios: ");
        for (int i : numerosAleatorios) {
            System.out.println(i);
            
        }
        System.out.println("Sucessores: ");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println(numerosAleatorios[i] +1 );
        }
    }
    
}
