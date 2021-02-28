/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.Event;

/**
 *
 * @author Citlalli
 */
public class Event {
    public final static Integer precioAlto = 35;
    public final static Integer precioBajo = 32;
    public final static Integer tipodeEvento = 50;

    private String evento;
    private Integer numerdoDeInvitados;
    private Integer costo;
    private Integer costoXPersona;

    public Event(){
        this.evento = "A000";
        this.numerdoDeInvitados = 0;
    }

    public Event(String evento, Integer numerdoDeInvitados) {
        this.evento = evento;
        this.numerdoDeInvitados = numerdoDeInvitados;
    }

    public static Integer getPrecioAlto() {
        return precioAlto;
    }

    public static Integer getPrecioBajo() {
        return precioBajo;
    }

    public static Integer getTipodeEvento() {
        return tipodeEvento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getNumerdoDeInvitados() {
        return numerdoDeInvitados;
    }

    public void setNumerdoDeInvitados(Integer numerdoDeInvitados) {
        this.numerdoDeInvitados = numerdoDeInvitados;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getCostoXPersona() {
        return costoXPersona;
    }

    public void setCostoXPersona(Integer costoXPersona) {
        this.costoXPersona = costoXPersona;
    }
}
