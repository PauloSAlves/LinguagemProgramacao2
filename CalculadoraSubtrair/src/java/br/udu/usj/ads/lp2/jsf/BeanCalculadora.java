/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udu.usj.ads.lp2.jsf;


import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
        
/**
 *
 * @author Paulo_Alves
 */
@ManagedBean
@RequestScoped

public class BeanCalculadora {

    private int a;
    private int b;
    private int resultado;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public String diminuir(){
    resultado = a-b ;
    return "resultado";
    }
}   
    