
package br.edu.usj.lpii.lpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Movimentacao{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean despesa;
    private double valor;
    private String titulo;
    
    public Movimentacao(){}

    public boolean isDespesa() {
        return despesa;
    }

    public void setDespesa(boolean despesa) {
        this.despesa = despesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
