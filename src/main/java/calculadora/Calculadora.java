/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Aday
 */
public class Calculadora {
    private int operador1;
    private int operador2;
    private int operacion(int a, int b){
        operador1=a;
        operador2=b;
        return a+b;
    }
}
