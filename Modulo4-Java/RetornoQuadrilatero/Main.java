package RetornoQuadrilatero;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio quadrilatero");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTriangulo = Quadrilatero.area(5, 5, 5);
        System.out.println("Area do triangulo: " + areaTriangulo);
        
    }
    
}



    

