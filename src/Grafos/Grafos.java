/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

/**
 *
 * @author jmanu
 */
public class Grafos {

    public static boolean eside(String cad) {
        int M[][] = {{1, 1, 1, -1, -1}, {1, 1, 1, 1, -1}}, edo = 0, ent;
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == '_') {
                ent = 1;
            } else {
                if (c == '$') {
                    ent = 2;
                } else {
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        ent = 0;
                    } else {
                        if (Character.isDigit(c)) {
                            ent = 3;
                        } else {
                            return false;
                        }
                    }
                }
            }
            edo = M[edo][ent];
            if (edo == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean esint(String cad) {
        int M[][] = {{1, 1, 1, -1, -1}, {1, 1, 1, 1, -1}}, edo = 0, ent;
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == '-') {
                ent = 1;
            } else {
                if (Character.isDigit(c)) {
                    ent = 3;
                } else {
                    return false;
                }
            }
            edo = M[edo][ent];
            if (edo == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean esHex(String cad) {
        int M[][] = {{0, 0, -1}}, edo = 0, ent;
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (Character.isDigit(c)) {
                ent = 0;
            } else {
                if ((c >= 'A' && c <= 'F')) {
                    ent = 0;
                } else {
                    return false;
                }
            }

            edo = M[edo][ent];
            if (edo == -1) {
                return false;
            }
        }
        return true;
    }
    public int esOp(String c){
        String OP[]={"=","+","-","/","*",";"};
        for (int i = 0; i < OP.length; i++) {
            if (c.equals(OP[i])) {
                return i;
            } 
        }
        return -1;
    }
}
