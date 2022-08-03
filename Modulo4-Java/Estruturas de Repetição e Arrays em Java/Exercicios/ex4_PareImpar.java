/*Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e quantidade de números impares */

import java.util.Scanner;

public class ex4_PareImpar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int quantNumeros;
            int numero;
            int quantPares = 0;
            int quantImpares = 0;


            System.out.println("Digite a quantidade de números: ");
            quantNumeros = scan.nextInt();

            int cont = 0;
            do{
                System.out.print("Número: ");
                numero = scan.nextInt();

                if(numero % 2 == 0) quantPares++;
                else quantImpares++;

                cont++;
            }while(cont < quantNumeros);

            System.out.println("Quantidade de números pares: " + quantPares);
            System.out.println("Quantidade de números impares: " + quantImpares);
        }
    }
}