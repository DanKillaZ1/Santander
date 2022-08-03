public class Mensagem {
    
    public static void obterMensagem(int hora){

        switch (hora) {
            case 9 :
                System.out.println("Boa madrugada");
                break;
            case 12:
                System.out.println("Boa tarde");
                break;
            case 15:
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Hora invalida");
                break;
        }
    }
}
