import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Dadas as seguintes informaçoes sobre meus gatos ,crie uma lista e ordene esta liste exibindo:
 * nome-idade e cor; 
 */

public class ExemploOrdenacaoList {
    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato( "Bixinho",  2,  "branco"));
            add(new Gato( "Bixinho2",  31,  "azul"));
            add(new Gato( "Bixinho3",  21,  "branco"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem (idade)\t---");
        Collections.sort(meusGatos, new ComparadorIdade());
        System.out.println(meusGatos);

    }
    
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;
    
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCor() {
        return cor;
    }
    
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
class ComparadorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparadorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}