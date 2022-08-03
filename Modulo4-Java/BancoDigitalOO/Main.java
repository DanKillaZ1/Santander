package BancoDigitalOO;

public class Main {
    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("daniel");

        Conta cc = new ContaCorrente(daniel);
        Conta poupanca = new ContaPoupanca(daniel);

        cc.depositar(100);
        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
