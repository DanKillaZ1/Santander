package Quadrilatero;

public class Quadrilatero {

    public static void area (double lado){

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area (double lado1, double lado2){

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }
    
    public static void area (double baseMaior, double baseMenor, double altura){

        System.out.println("Área do triângulo: " + ((baseMenor + baseMaior)*altura) / 2);
    }

    //Área do Losango

    public static void area (Float diagonalMaior, Float diagonalMenor){

        System.out.println("Área do losango: " + (diagonalMaior * diagonalMenor) / 2);
    }
}
