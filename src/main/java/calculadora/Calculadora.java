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

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return oper2;
    }

    public void setOperador2(int operador2) {
        this.oper2 = operador2;
    } 
    private int operador1;
<<<<<<< HEAD
    private int operador2;
    /**
     * 
     * @param a primer parámetro
     * @param b segundo parámetro
     * @return retorna el valor de la suma
     */
    private int operacion(int a, int b){
=======
    private int oper2;
    private int operador(int a, int b){
>>>>>>> cambiosdenombre
        operador1=a;
        oper2=b;
        return a+b;
    }
}
