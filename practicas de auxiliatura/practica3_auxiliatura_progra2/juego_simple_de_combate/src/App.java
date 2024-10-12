import Personajes.*;
import java.util.Random;
import java.util.Scanner;

import Enemy.TheBigBoss;
import Enemy.Vampire;
import Enemy.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String readKeyBoard;

        do{
            createMenu();
            System.out.println("ingresa una opcion");
            readKeyBoard = input.nextLine();
            Integer options = Integer.parseInt(readKeyBoard);
            switch (options) {
                case 1:
                Random level = new Random();
                Wizhart DeOz = new Wizhart("DeOz", level.nextInt(9) + 1 , 100 , 48);
                Warrior Leonidas =new Warrior("Leonidas",(level.nextInt(9) + 1),100, 300);
                System.out.println("Inicio de la simulacion");
                Random random = new Random();
                if (random.nextInt(2) + 1 == 1) {
                    while (DeOz.Alive() != false | Leonidas.Alive() != false) {
                        DeOz.castSpell();
                        Leonidas.takeDamage(DeOz.atack());
                        if(Leonidas.Alive() == false){
                            break;
                        } 
                        Leonidas.castSpell();
                        DeOz.takeDamage(Leonidas.atack());
                        if (DeOz.Alive() == false) {
                            break;
                        }
                    }
                    if (DeOz.Alive() == false){
                        System.out.println("Leonidas el espartano gano");
                    }
                    else{
                        System.out.println("el mago de oz gano");
                    }
                }
                else{
                    while (DeOz.Alive() != false | Leonidas.Alive() != false) {
                        Leonidas.castSpell();
                        DeOz.takeDamage(Leonidas.atack());
                        if (DeOz.Alive() == false) {
                            break;
                        }
                        DeOz.castSpell();
                        Leonidas.takeDamage(DeOz.atack());
                        if(Leonidas.Alive() == false){
                            break;
                        }
                    }
                    if (DeOz.Alive() == false){
                        System.out.println("Leonidas el espartano gano");
                    }
                    else{
                        System.out.println("el mago de oz gano");
                    }
                }
                    break;
                case 2:
                System.out.println("Crea tu personaje");
                System.out.println("create un nombre: ");
                Scanner Input = new Scanner(System.in);
                String name = Input.nextLine();
                System.out.println("elije tu nivel: ");
                Integer Level = Input.nextInt();
                Persons jugador1 = new Persons(name, Level, 100);
                Vampire vampiro1 = new Vampire("dracula (bla bla blaa)", 100, 10);
                Zombie zombie1 = new Zombie("Frankenstain", 100, 10);
                TheBigBoss DaddyYankee = new TheBigBoss("DaddyYanke", 250, 20, 2.0);
                Scanner Options = new Scanner(System.in);
                Opcions();
                System.out.println("elige una opcion: ");
                String IntroducingOption = Options.nextLine();
                Integer Opcions = Integer.parseInt(IntroducingOption);
                Random numberrandom = new Random();
                switch (Opcions) {
                    case 1:
                        if(numberrandom.nextInt(2) + 1 == 1){
                            System.out.println("Empiezas primero ");
                            while (jugador1.Alive() != false | vampiro1.Alive() != false) {
                                jugador1.takeDamage(vampiro1.atack());
                                if (jugador1.Alive() == false) {
                                    break;
                                }
                                vampiro1.takeDamage(jugador1.atack());
                                if(vampiro1.Alive() == false){
                                    break;
                                }
                            }
                            if (jugador1.Alive() == false){
                                System.out.println("dracula gano (bla bla blaa)");
                            }
                            else{
                                System.out.println("venciste a dracula siuuu");
                            }
                        }
                        else{
                            System.out.println("Dracula empieza primero ");
                            while (jugador1.Alive() != false | vampiro1.Alive() != false) {
                                vampiro1.takeDamage(jugador1.atack());
                                if(vampiro1.Alive() == false){
                                    break;
                                }
                                jugador1.takeDamage(vampiro1.atack());
                                if (jugador1.Alive() == false) {
                                    break;
                                }
                            }
                            if (jugador1.Alive() == false){
                                System.out.println("dracula gano (bla bla blaa)");
                            }
                            else{
                                System.out.println("venciste a dracula siuuu");
                            }
                        }
                    break;
                    case 2:
                        if(numberrandom.nextInt(2) + 1 == 1){
                            while (jugador1.Alive() != false | zombie1.Alive() != false) {
                                jugador1.takeDamage(zombie1.atack());
                                if (jugador1.Alive() == false) {
                                    break;
                                }
                                zombie1.takeDamage(jugador1.atack());
                                if(zombie1.Alive() == false){
                                    break;
                                }
                            }
                            if (jugador1.Alive() == false){
                                System.out.println("frankenstein gano aahhhh");
                            }
                            else{
                                System.out.println("venciste a frankensten");
                            }
                        }
                        else{
                            while (jugador1.Alive() != false | zombie1.Alive() != false) {
                                zombie1.takeDamage(jugador1.atack());
                                if(zombie1.Alive() == false){
                                    break;
                                }
                                jugador1.takeDamage(zombie1.atack());
                                if (jugador1.Alive() == false) {
                                    break;
                                }
                            }
                            if (jugador1.Alive() == false){
                                System.out.println("frankenstein gano aahhhh");
                            }
                            else{
                                System.out.println("venciste a frankensten");
                            }
                        }
                    break;
                    case 3:
                        if(numberrandom.nextInt(2) + 1 == 1){
                            while (jugador1.Alive() != false | DaddyYankee.Alive() != false) {
                                jugador1.takeDamage(DaddyYankee.atack());
                                if (jugador1.Alive() == false) {
                                    break;
                                }
                                DaddyYankee.takeDamage(jugador1.atack());
                                if(vampiro1.Alive() == false){
                                    break;
                                }
                            }
                            if (jugador1.Alive() == false){
                                System.out.println("el jefe te gano");
                            }
                            else{
                                System.out.println("venciste al jefe ");
                            }
                        }
                        else{
                            while (jugador1.Alive() != false | DaddyYankee.Alive() != false) {
                                DaddyYankee.takeDamage(jugador1.atack());
                                if(DaddyYankee.Alive() == false){
                                    break;
                                }
                                jugador1.takeDamage(DaddyYankee.atack());
                                if (jugador1.Alive() == false) {
                                    break;
                                }
                            }
                            if (jugador1.Alive() == false){
                                System.out.println("el jefe te gano");
                            }
                            else{
                                System.out.println("venciste al jefe");
                            }
                        }
                    break;
                }
            }
        }    
        while (!readKeyBoard.equals("3"));
        input.close();
    }
    public static void createMenu(){
        System.out.println("1. jugar la simulacion");
        System.out.println("2. jugar el minijuego");
        System.out.println("3. salir");
    }
    public static void Opcions(){
        System.out.println("1. ir con dracula");
        System.out.println("2. ir con frankenstein");
        System.out.println("3. ir con the BIG BOSS");
    }
}