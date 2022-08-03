import java.util.Scanner;

/*Faça um programa que leia conjunto de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome) */

public class Ex1_nomeEIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        
        System.out.println("Digite a idade do aluno: ");
        idade = sc.nextInt();
        
        if(nome.equals("0")) {
            System.out.println("Programa encerrado.");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        
        sc.close();
    }
}