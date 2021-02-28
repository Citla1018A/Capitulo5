/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5;

/**
 *
 * @author Citlalli
 */
import Capitulo5.Event.Event;
import Capitulo5.GameZoneDie.Die;
import Capitulo5.GameZoneRandomGuess2.RandomGuess2;
import Capitulo5.GameZoneRockPaperScissors.RockPaperScissors;
import Capitulo5.Rental.Rental;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("CASE PROBLEM 1");
        Scanner sc =new Scanner(System.in);
        ArrayList<Event> eventos = new ArrayList<>();

        for (int i = 0; i < 1; i++) {

            System.out.println("Introduce el evento");
            String even = sc.nextLine();

            System.out.println("Introduce el numero de invitados");
            int inv = sc.nextInt();

            eventos.add(new Event(even,inv));

        }

        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(eventos.get(i).getEvento());
            System.out.println(eventos.get(i).getNumerdoDeInvitados());
        }
        System.out.println("CASE PROBLEM 2");
         //     Scanner sc = new Scanner(System.in);
        ArrayList<Rental> renta = new ArrayList<>();

        for (int i = 0; i <1 ; i++) {
            System.out.println("Introduce el contrato");
            String x =  sc.nextLine();

            System.out.println("Introduce el numero de minutos");
            int y = sc.nextInt();

            renta.add(new Rental(x,y));

        }

        for (int i = 0; i <renta.size() ; i++) {
            System.out.println(renta.get(i).getContrato());
            System.out.println(renta.get(i).getMinutos());

        }
        System.out.println("GAME ZONE");
        System.out.println("GAME ZONE 1");
        RandomGuess2 user = new RandomGuess2();
        user.iniciar();
        System.out.println("GAME ZONE 2");
        System.out.println("GAME ZONE 4");
        Die dado1 = new Die();
        Die dado2 = new Die();

        if (dado1.getvalor() == dado2.getvalor()){
            System.out.println("Empate");
        }else if (dado1.getvalor() > dado2.getvalor()){
            System.out.println("Dado 1 es mas grande");
        }else{
            System.out.println("Dado 2 es mas grnade");
        }
        System.out.println("GAME ZONE 5");
        RockPaperScissors a = new RockPaperScissors();
        a.juego();
    }
    
    
    
}
