//Criar um simples projeto e criar variaveis e expressões para usar nas estruturas IF e SWITCH
//Com IF, exiba o nome do mês do ano de acordo com seu numero.
//Evite o efeito "flecha".Faça também outro if que verifique se o mes e julho,dezembro ou janeiro, para exibir o texto "ferias".
//Com switch use string para a partir do dia da semana exibir seu numero. ainda no switch faça outro exemplo onde se uma variavel inteira for entre 1 e 3 exibir o texto "certo". se for 4 exivir errado se for 5 "talvez".Para demais valores exibir "não sei".

public class Main {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifFlecha() {
        int mes = 15;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");

            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Não sei");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
    
    private static void ifSemFlecha() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");

        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Não sei");
        }
    }
    
    private static void ifFerias() {
        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Ferias");
        } else {
            System.out.println("Não é ferias");
        }
    }

    private static void ifMenor() {
       
        double salarioMensal = 11893.58d;
        double mediasalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediasalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionario deve receber auxilio");
        } 

        boolean salarioBaixo = salarioMensal < mediasalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        if (salarioBaixo && muitosDependentes) {
            System.out.println("Funcionario deve receber auxilio");
        }

        boolean recebeauxilio = salarioBaixo && muitosDependentes;
        if (recebeauxilio) {
            System.out.println("Funcionario deve receber auxilio");
        }else{
            System.out.println("Funcionario não deve receber auxilio");
        }

    }

    private static void switchSemana(){

        String dia = "sabado";
        switch (dia){
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            case "domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Não sei");
                break;
        }

    }

    private static void switchNumero () {

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("certo");
                break;               
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
        
    }

    private static void switchFerias() {
        String mes = "dezembro";
        switch (mes) {
            case "julho":
            case "dezembro":
            case "janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Não é ferias");
                break;
        }
    }
}

        
            
            