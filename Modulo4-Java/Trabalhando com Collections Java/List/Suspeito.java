import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 * 
 * Pergunte: "Telefonou para a vítima?"
 * Pergunte: "Esteve no local do crime?"
 * Pergunte: "Mora perto da vítima?"
 * Pergunte: "Devia para a vítima?"
 * Pergunte: "Já trabalhou com a vítima?"
 * Se a pessoa reponder positivamente a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
 * Caso contrário, ele será classificado como "Inocente".
 */



public class Suspeito {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            List<String> perguntas = new ArrayList<>();
            perguntas.add("Telefonou para a vítima?");
            perguntas.add("Esteve no local do crime?");
            perguntas.add("Mora perto da vítima?");
            perguntas.add("Devia para a vítima?");
            perguntas.add("Já trabalhou com a vítima?");
            List<String> respostas = new ArrayList<>();
            for (int i = 0; i < perguntas.size(); i++) {
                System.out.println(perguntas.get(i));
                respostas.add(sc.nextLine());
            }
            int contador = 0;
            for (int i = 0; i < respostas.size(); i++) {
                if (respostas.get(i).equals("sim")) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("Suspeito");
            } else if (contador >= 3 && contador <= 4) {
                System.out.println("Cúmplice");
            } else if (contador == 5) {
                System.out.println("Assassino");
            } else {
                System.out.println("Inocente");
            }
        }
    }
    
}
