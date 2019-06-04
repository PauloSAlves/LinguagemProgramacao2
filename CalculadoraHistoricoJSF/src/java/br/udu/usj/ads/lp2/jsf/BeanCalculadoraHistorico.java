/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udu.usj.ads.lp2.jsf;


import java.util.ArrayList;
import java.util.List;
//import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
        
/**
 *
 * @author Paulo_Alves
 */
@ManagedBean
//@RequestScoped
//@ApplicationScoped
@SessionScoped

public class BeanCalculadoraHistorico {

    
    private List<String> historico = new ArrayList<>();
    private int a;
    private int b;
    //private int resultado;
    public List <String> getHistorico(){
    return historico;
    } 
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    //public int getResultado() {
     //   return resultado;
    //}

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    //public void setResultado(int resultado) {
     //   this.resultado = resultado;
    //}
    
    public void somar(){
    int resultado = a+b ;
    historico.add(a + "+" + b +"=" + resultado);
    }
}
  