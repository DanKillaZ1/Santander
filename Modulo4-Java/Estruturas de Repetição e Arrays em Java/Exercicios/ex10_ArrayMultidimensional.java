/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */

import java.util.Random; 
public class ex10_ArrayMultidimensional {
    public static void main(String[] args){
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(10);
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
