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
public class General {
    public static int [][] suma (int A[][], int B[][],int n,int m){
        int C[][]=new  int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               C[i][j]=A[i][j]+B[i][j];                
            }  
        }
        return C;
    }
    public static void lineal(int n){
        for (int i = 0; i < n; i++) {
            func(i);
            
        }
    }
    public static void func(int n){
        int i=1;
        while (i<n) {            
            i=i*2;
            System.out.println(i);
        }
    }
    public static int [] conArray (int A[], int B[],int n,int m){
        int C[]=new  int [n+m];
        for (int i = 0; i < C.length; i++) {
            if (i<n) {
                C[i]=A[i];
            }else{
                C[i]=B[i-n];
            }
            
        }
        return C;
    }
    public static int[][] mult(int A[][], int B[][]) {
        int cA = A[0].length;
        int fA = A.length;
        int fB = B.length;
        int cB = B[0].length;
        int[][] C = new int[fA][cB];
        
        if (cA == fB) {
            for (int i = 0; i < fA ; i++) {
                for (int j = 0; j < cB ; j++) {
                    for (int k = 0; k < cA; k++) {
                        C[i][j] = C[i][j]+(A[i][k] * B[k][i]);
                        
                    }
                }

            }
        }
        return C;
    }
    public static void fibo(int n){
        int n1 = 0;
        int n2 = 1;
        int aux;

        System.out.println(n1);
        System.out.println(n2);

        while (n2 + n1 <= n) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
            
        }
    }
    public static void main(String[] args) {
        
        //fibo(20); // llamamos al método
        //lineal(10000);
        int A[][]={{19,23,3}, {6,70,8}, {11,182,13}};
        int B[][]={{1,2,30}, {68,97,8}, {118,12,193}};
        long startTime = System.nanoTime();//currentTimeMillis
        int C[][]= mult(A, B);
            
    long endTime = System.nanoTime() - startTime;
    System.out.println("Duración " + endTime + " Nanosegundos.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j]+" ");
            }System.out.println(""); 
        }
    }
    //N numeros d la serie de fibonasi
//    long startTime = System.nanoTime();//currentTimeMillis
//    long endTime = System.nanoTime() - startTime;
//    System.out.println("Duración " + endTime + " Nanosegundos.");
}
