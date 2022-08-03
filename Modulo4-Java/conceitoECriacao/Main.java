public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(10, 20);
        Calculadora.multiplicacao(10, 20);
        Calculadora.divisao(10, 2.5);


        //Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(  9);
        Mensagem.obterMensagem(  12);
        Mensagem.obterMensagem(  15);


        //Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular( 1000, 2);
        Emprestimo.calcular( 1000, 3);
        Emprestimo.calcular( 1000, 5);
    }
    

}
