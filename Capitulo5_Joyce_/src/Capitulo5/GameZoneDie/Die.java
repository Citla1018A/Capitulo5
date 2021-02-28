/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.GameZoneDie;

/**
 *
 * @author Citlalli
 */
public class Die {
     private Integer valor;

    public Die() {
        this.lanzar();
    }

    public void lanzar(){
        this.valor = (int)(Math.random() * 6 + 1);
    }

    public Integer getvalor() {
        return valor;
    }

    public void setvalor(Integer valor) {
        this.valor = valor;
    }
}
