/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1;

/**
 *
 * @author jmanu
 */
public class Array2sum {
    int [][] sumArray2(int A[][],int B[][]){
        int sum[][]= new int [A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                sum[i][j]=A[i][j]+B[i][j];              
            }   
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
