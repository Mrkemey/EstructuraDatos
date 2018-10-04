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
public class Fact {
    int fact(int n){
        int f=1;
        for (int i = 0; i <= f; i++) {
            f=f*i;            
        }
        return f;
    }
    
    int factR( int n){
        if(n==1)return 1;
        else return n*factR(n-1);
    }
}
