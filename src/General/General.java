/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import javax.swing.JOptionPane;

/**
 *
 * @author jmanu
 */
public class General {

    public static int[][] generatabla(int n) {
        int R[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            R[i][0] = i;
            R[i][1] = (int) (2 * (Math.pow(i, 2)) + 2);

        }

        return R;
    }

    public static int mutlRusa(int a, int b) {

        if (a == 1) {
            return b;
        } else {
            if (a % 2 != 0) {
                return b + mutlRusa(a / 2, b * 2);
            } else {
                return mutlRusa(a / 2, b * 2);
            }

        }
    }

    public static int multRusa(int a, int b) {
        int c = 0;
        for (; a != 0; a /= 2,b*=2) {
            if (a % 2 != 0) {
                c = c + b;
            }
        }
        return c;
    }

    public static boolean perf(int n, int d, int s) {
        if (d == 0) {
            return n == s;
        } else {
            if (n % d == 0) {
                s += d;
                return perf(n, d - 1, s);
            } else {
                return perf(n, d - 1, s);
            }
        }
    }

    public static int sumaDig(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumaDig(n / 10);
        }
    }

    public static int invDig(int n, int p) {
        if (n < 10) {
            return n;
        } else {
            return (int) ((n % 10) * Math.pow(10, p) + invDig(n / 10, p - 1));
        }
    }

    public static int invDig(int n) {
        int p = (n + "").length() - 1;
        if (n < 10) {
            return n;
        } else {
            return (int) ((n % 10) * Math.pow(10, p) + invDig(n / 10));
        }
    }

    public static int[][] suma(int A[][], int B[][], int n, int m) {
        int C[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void lineal(int n) {
        for (int i = 0; i < n; i++) {
            func(i);

        }
    }

    public static void func(int n) {
        int i = 1;
        while (i < n) {
            i = i * 2;
            System.out.println(i);
        }
    }

    public static int[] conArray(int A[], int B[], int n, int m) {
        int C[] = new int[n + m];
        for (int i = 0; i < C.length; i++) {
            if (i < n) {
                C[i] = A[i];
            } else {
                C[i] = B[i - n];
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
            for (int i = 0; i < fA; i++) {
                for (int j = 0; j < cB; j++) {
                    for (int k = 0; k < cA; k++) {
                        C[i][j] = C[i][j] + (A[i][k] * B[k][i]);

                    }
                }

            }
        }
        return C;
    }

    public static int mayArray(int A[][]) {
        int t = A[0][0];//1
        for (int i = 0/*1*/; i < A.length/*n+1*/; i++/*n*/) {//2n+2
            for (int j = 0; j < A[0].length; j++) {/*2n+2*/
                if (t < A[i][j]) {/*n*/
                    t = A[i][j];/*n*/
                }//2n

            }//(2n+2)+2n=4n+2

        }//2n+2*4n+2=  4n^2+2n+4
        return t;
    }

    public static int[] SumVec(int A[][]) {
        int B[] = new int[A.length];//1
        for (int i = 0; i < A.length; i++) {//2n+2
            for (int j = 0; j < A[0].length; j++) {//(3n+2)n
                B[i] += A[i][j];
            }
        }
        return B;//1
    }

    public static int[] repArray(int A[], int B[]) {
        int t = 0;
        int n = 0;
        if (A.length <= B.length) {
            n = A.length;
        } else {
            n = B.length;
        }
        int R[] = new int[n];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    t++;

                }
            }
            if (t > 0) {
                R[i] = A[i];
            }
        }
        return R;
    }

    public static int binDec(String b) {
        String B[] = new String[b.length()];
        for (int i = 0; i < b.length(); i++) {
            B[i] = b.substring(i, i + 1);
        }
        int r = 0;
        int t = b.length() - 1;
        for (String B1 : B) {
            System.out.println(B1 + " " + t);
            if (Integer.parseInt(B1) == 1) {
                r += Math.pow(2, t);
            }

            t--;
        }
        return r;
    }

    public static int moda(int A[]) {
        int co = 0, r = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                //if (i!=j) {               
                if (A[j] == A[i]) {
                    co++;
                }
                //} 

            }
            if (co >= 1) {
                r = A[i];
            }
            co = 0;
        }
        return r;
    }

    public static String decBin(int n) {
        String b = "";
        while (n > 0) {
            b = n % 2 + b;
            n /= 2;
        }
//        for (;  n< 10; n/=2) {
//            b=n%2+b;
//        }
        return b;
    }

    public static void fibo(int n) {
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

    public static int sumDiag(int A[][], int n) {
        if (n == 0) {
            return 0;
        } else {
            return A[n][n] + sumDiag(A, n - 1);
        }
    }

    public static int sumDiag(int A[][]) {
        return sumDiag(A, A.length - 1);
    }

    public static int sum2D(int A[][], int n, int c) {
        if (n == -1) {
            return 0;
        } else {
            if (c == 0) {
                return A[n][c] + sum2D(A, n - 1, A[0].length - 1);
            } else {
                return A[n][c] + sum2D(A, n, c - 1);
            }
        }
    }

    public static int sum2D(int A[][]) {
        return sum2D(A, A.length - 1, A[0].length - 1);
    }

    public static boolean par(int n) {
        if (Math.abs(n) % 2 == 0) {
            return true;
        } else {
            return impar(n);
        }
    }

    public static boolean impar(int n) {
        if (Math.abs(n) % 2 != 0) {
            return false;
        } else {
            return par(n);
        }
    }

    public static long pot2n(long n, long x) {
        if (n == 0) {
            return 1;
        } else {
            return x * pot2n(n - 1, x);
        }
    }

    public static int division(int a, int b) {
        if (a < b) {
            return 0;
        } else {
            return 1 + division(a - b, b);
        }
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static int suma1aNR(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + suma1aNR(n - 1);
        }
    }

    public static int suma1aNRang(int b, int n) {
        if (n == b) {
            return n;
        } else {
            return n + suma1aNR(n - 1);
        }
    }

    public static int suma1aNRang2(int a, int b) {
        if (b == a) {
            return b;
        } else {
            return (b + a) + suma1aNRang2(a + 1, b - 1);
        }
    }

    public static int summ51N(int n) {
        if (n < 5) {
            return 0;
        } else {
            if (n % 5 == 0) {
                return n + summ51N(n - 1);
            } else {
                return summ51N(n - 1);
            }
        }
    }

    public static void main(String[] args) {

//        //fibo(20); // llamamos al método
//        //lineal(10000);
//        int a;
//        int A[][]={{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(sum2D(A));
//        int B[][]={{1,2,30}, {68,97,8}, {118,12,193}};
//        long startTime = System.nanoTime();//currentTimeMillis
//        //a=mayArray(A);
//        
//        
//            
//    long endTime = System.nanoTime() - startTime;int C[][]= mult(A, B);//System.out.println(a);
//    System.out.println("Duración " + endTime + " Nanosegundos.");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(C[i][j]+" ");
//            }System.out.println(""); 
////        }
//int A[]={1,2,3};
//int B[]={1,2,3};
//int C[]=repArray(A, B);
//        for (int i = 0; i < C.length; i++) {
//            System.out.println(C[i]);
//           String a="100";
//           int c=binDec(a);
//           System.out.println(c);
//int A[]={17,18,19,18,20};
//int a=0;
//    long startTime = System.nanoTime();//currentTimeMillis
//        System.out.println("");
//    long endTime = System.nanoTime() - startTime;
//    System.out.println("Duración " + endTime + " Nanosegundos.");
//generatabla(5);
        JOptionPane.showMessageDialog(null, multRusa(4, 12));
    }

    //N numeros d la serie de fibonasi
//    long startTime = System.nanoTime();//currentTimeMillis
//    long endTime = System.nanoTime() - startTime;
//    System.out.println("Duración " + endTime + " Nanosegundos.");
}
