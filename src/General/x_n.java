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
public class x_n {
    int pow(int n,int x){
        int f=x;
        for (int i = 1; i <= n; i++) {
            x=x*f;  
        }
        return x;
    }
}
