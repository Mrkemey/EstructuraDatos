
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmanu
 */
public class Matriz {
 
    public static void intMat(int n){
        int M[][]=new int [n][n];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (i==j) {
                    M[i][j]=1;
                } 
                System.out.print(M[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        intMat(10);
    }
}
