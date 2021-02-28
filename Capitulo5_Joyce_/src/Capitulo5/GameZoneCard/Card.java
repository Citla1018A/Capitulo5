/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.GameZoneCard;

import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class Card {
    private char suit;
    private int n;

    Scanner leer = new Scanner(System.in);

    public void setSuit(){
        this.suit = leer.next().charAt(0);
        leer.nextLine();
    }

    public void setN(){
        final int CARDS_IN_SUIT = 13;
        this.n = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    }

    public char getSuit(){
        return this.suit;

    }

    public int getN(){
        return this.n;
    }

}
