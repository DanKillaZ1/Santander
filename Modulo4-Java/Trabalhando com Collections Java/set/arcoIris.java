

/*Crie um conjunto de contendo as cores de um arco-iris:
Exiba todas as cores do arco-iris.
A quantidade de cores do arco-iris é:
Exiba as cores em ordem alfabética.
Exiba as cores na ordem inversa que foi informada
exiba todas as cores que comeca com a letra ‘v’
remova todas as cores que comecam com a letra "V"
Limpe o conjunto
Confira se o conjunto esta vazio
*/


import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class arcoIris {
    public static void main(String[]args){
        System.out.println("Crie um conjunto de contendo as cores de um arco-iris: ");
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "verde", "azul", "amarelo", "branco", "preto", "cinza", "rosa", "laranja", "marrom"));
        System.out.println(cores);

        System.out.println("Exiba todas as cores do arco-iris: ");
        for(String cor: cores){
            System.out.println(cor);
        }
        System.out.println("A quantidade de cores do arco-iris é: " + cores.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresOrdemAlfabetica = new LinkedHashSet<>(
            Arrays.asList("vermelho", "verde", "azul", "amarelo", "branco", "preto", "cinza", "rosa", "laranja", "marrom"));
        System.out.println(coresOrdemAlfabetica);
        List<String> coresOrdemAlfabetica2 = new ArrayList<>(coresOrdemAlfabetica);
        Collections.sort(coresOrdemAlfabetica2);
        System.out.println(coresOrdemAlfabetica2);

        System.out.println("Exiba as cores que começam com a letra V. ");
        for(String cor: cores){
            if(cor.startsWith("v")){
                System.out.println(cor);
            }
        }

        System.out.println("Remova todas as cores que comecam com a letra V. ");
        Iterator<String> iterator2 = cores.iterator();
        while(iterator2.hasNext()){
            String cor = iterator2.next();
            if(cor.startsWith("v")){
                iterator2.remove();
            }
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto ");
        cores.clear();

        System.out.println("Confira se o conjunto esta vazio " + cores.isEmpty());
        
        
    }
}

