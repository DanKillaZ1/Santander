/*
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 *e imprima as consoantes lidas.
 */

import java.util.Scanner;

public class ex8_Consoantes {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] consoantes = new String[6];
            int quantidadeConsoantes = 0;

            int count = 0;

            do {
                System.out.println("Digite 6 caracteres: ");
                String letra = scan.nextLine();

                if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
                    count++;
                }
            }
            while (count < consoantes.length);


            System.out.println("Consoantes: ");
            for(String consoante : consoantes) {
                if (consoante != null) {
                    System.out.println(consoante + " ");
                }
                System.out.println("quantidade de consoantes " + quantidadeConsoantes);
            }
        }
       
    }     
    
}
