package Exercicio2;

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));


        System.out.println("b2 || b3: " + (b2 || b3));
        System.out.println("b4 || b2: " + (b4 || b2));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b1 ^ b4 " + (b1 ^ b4));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 20;
        float f1 = 10.5f;
        float f2 = 20.5f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + (((i1 > i2) || (f2 < f1))));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDepententes = quantidadeDependentes >= mediaDependentes;

        System.out.println(salarioBaixo && muitosDepententes);

        boolean recebeAuxilio = salarioBaixo && muitosDepententes;
        System.out.println("recebeAuxilio" + recebeAuxilio);


        
    }
    
}
