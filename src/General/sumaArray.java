/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

/**
 *
 * @author jmanu
 */
public class sumaArray {
    public int sumaVector(int A[]){
        int s=0;
        for (int i : A) {
            s=s+A[i];
        }
        System.out.println(s);
        return s;
    }
}
