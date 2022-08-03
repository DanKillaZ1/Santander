class Carro extends Veiculo {
    String modelo;
    String cor;
    int capacidadeTanque;

    //Lista vazia
    Carro(){

    }

    //Lista recebendo os parametros
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    //get e set tanque
    //método do total para encher o tanque

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


}
