package br.edu.usj.ads.lp2.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanCalculadoraOperacao {

    private float number1;
    private float number2;
    private float resultado;
    private int operator;

    public BeanCalculadoraOperacao() {

    }

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public String calculate() {

        Calculator cal = new Calculator();
        
            switch (operator) {
            case 0:
                setResultado(cal.add(number1, number2));
                break;
            case 1:
                setResultado(cal.sub(number1, number2));
                break;

            case 2:
                setResultado(cal.mul(number1, number2));
                break;
            case 3:
                setResultado(cal.div(number1, number2));
                break;

            default:
                throw new RuntimeException("erro");
        }
        return "resultado1";
    }

        }
