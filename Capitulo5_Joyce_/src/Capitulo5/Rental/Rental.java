/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.Rental;

/**
 *
 * @author Citlalli
 */
public class Rental {
    public final static Integer minutosHora = 60;
    public final static Integer precioxHora = 40;

    private String contrato;
    private Integer minutos;
    private Integer horas;
    private Integer minutosExtas;
    private Integer pagp;

    public Rental(){
        this("A000", 0);
    }

    public Rental(String contrato, Integer minutos) {
        this.contrato = contrato;
        this.minutos = minutos;
        this.horas = minutos / 60;
        this.minutosExtas = this.minutos % 60;
        this.pagp = (this.horas * 40) + (this.minutosExtas / 40) + (this.minutosExtas % 40);
    }

    public static Integer getMinutosHora() {
        return minutosHora;
    }

    public static Integer getPrecioxHora() {
        return precioxHora;
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutosExtas() {
        return minutosExtas;
    }

    public void setMinutosExtas(Integer minutosExtas) {
        this.minutosExtas = minutosExtas;
    }

    public Integer getPagp() {
        return pagp;
    }

    public void setPagp(Integer pagp) {
        this.pagp = pagp;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public void setMinutos(int min){
        this.minutos = min;
        this.horas = min / 60;
        this.minutosExtas = min % 60;
        this.pagp = (this.horas * 40) + (this.minutosExtas / 40) + (this.minutosExtas % 40);
    }
}
