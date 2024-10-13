import Personajes.*;
import java.util.Random;
import java.util.Scanner;
import Enemy.TheBigBoss;
import Enemy.Vampire;
import Enemy.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input1 = new Scanner(System.in);
        String readKeyBoard;
        do{
            createMenu();
            System.out.println("ingresa una opcion");
            readKeyBoard = input1.nextLine();
            Integer options = Integer.parseInt(readKeyBoard);
            switch (options) {
                case 1:
                Random level = new Random();
                Wizhart DeOz = new Wizhart("DeOz", level.nextInt(9) + 1 , 100 , 48);
                Warrior Leonidas =new Warrior("Leonidas",(level.nextInt(9) + 1),100, 300);
                System.out.println("Inicio de la simulacion");
                Random random = new Random();
                if (random.nextInt(2) + 1 == 1) {
                    System.out.println("el mago empieza primero");
                    while (DeOz.Alive() != false | Leonidas.Alive() != false) {
                        DeOz.castSpell();
                        System.out.println(DeOz.getLivePoints());
                        Leonidas.takeDamage(DeOz.atack());
                        if(Leonidas.Alive() == false){
                            break;
                        }
                        Leonidas.castSpell();
                        System.out.println(Leonidas.getLivePoints());
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
                    System.out.println("el querrero empieza primero");
                    while (DeOz.Alive() != false | Leonidas.Alive() != false) {
                        Leonidas.castSpell();
                        System.out.println(Leonidas.getLivePoints());
                        DeOz.takeDamage(Leonidas.atack());
                        if (DeOz.Alive() == false) {
                            break;
                        }
                        DeOz.castSpell();
                        System.out.println(DeOz.getLivePoints());
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
                System.out.println("elije un personaje");
                characterOptions();
                System.out.print("elije una opcion");
                Scanner input2 = new Scanner(System.in);
                Integer option2  = input2.nextInt();
                switch (option2) {
                    case 1:
                        System.out.println("create un nombre, arquero: ");
                        Scanner attribute = new Scanner(System.in);
                        String name1 = attribute.nextLine();
                        System.out.println("elije tu nivel: ");
                        Integer Level1 = attribute.nextInt();
                        Archer jugador1 = new Archer(name1 , Level1 , 100 ,50);
                        Scanner input3 = new Scanner(System.in);
                        String readKeyBoard2;
                        do{
                            Opcions();
                            System.out.println("elige una opcion: ");
                            readKeyBoard2 = input3.nextLine();
                            Integer option3 = Integer.parseInt(readKeyBoard2);
                            Random numberrandom = new Random();
                            switch (option3) {
                                case 1:
                                    Vampire vampiro1 = new Vampire("dracula (bla bla blaa)", 100, 10);
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        System.out.println("Empiezas primero ");
                                        while (jugador1.Alive() != false | vampiro1.Alive() != false) {
                                            System.out.println(jugador1.getLivePoints());
                                            System.out.println(vampiro1.getLifePoint());
                                            Integer damag = vampiro1.atack();
                                            System.out.println(damag);
                                            jugador1.takeDamage(damag);
                                            System.out.println(jugador1.getLivePoints());
                                            if(jugador1.Alive() == false) {
                                                break;
                                            }
                                            System.out.println(vampiro1.getLifePoint());
                                            Integer damag2 = jugador1.atack();
                                            System.out.println(damag2);
                                            vampiro1.takeDamage(damag2);
                                            System.out.println(vampiro1.getLifePoint());
                                            if(vampiro1.Alive() == false){
                                                break;
                                            }
                                        }
                                        if(jugador1.Alive() == false){
                                            System.out.println("dracula gano (bla bla blaa)");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a dracula siuuu");
                                        }
                                    }
                                    else{
                                        System.out.println("Dracula empieza primero ");
                                        while (jugador1.Alive() != false | vampiro1.Alive() != false) {
                                            System.out.println(jugador1.getLivePoints());
                                            System.out.println(vampiro1.getLifePoint());
                                            Integer damag3 = jugador1.atack();
                                            System.out.println(damag3);
                                            vampiro1.takeDamage(damag3);
                                            System.out.println(vampiro1.getLifePoint());
                                            if(vampiro1.Alive() == false){
                                                break;
                                            }
                                            System.out.println(jugador1.getLivePoints());
                                            Integer damag4 = vampiro1.atack();
                                            System.out.println(damag4);
                                            jugador1.takeDamage(damag4);
                                            System.out.println(jugador1.getLivePoints());
                                            if(jugador1.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if(jugador1.Alive() == false){
                                            System.out.println("dracula gano (bla bla blaa)");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a dracula siuuu");
                                        }
                                    }
                                break;
                                case 2:
                                    Zombie zombie1 = new Zombie("Frankenstain", 100, 10);
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        System.out.println("Empiezas primero ");
                                        while (jugador1.Alive() != false | zombie1.Alive() != false) {
                                            System.out.println(jugador1.getLivePoints());
                                            Integer damage = zombie1.atack();
                                            System.err.println(damage);
                                            jugador1.takeDamage(damage);
                                            System.out.println(jugador1.getLivePoints());
                                            if (jugador1.Alive() == false) {
                                                break;
                                            }
                                            System.out.println(zombie1.getLifePoint());
                                            Integer damage2 = jugador1.atack();
                                            System.out.println(damage2);
                                            zombie1.takeDamage(damage2);
                                            System.out.println(zombie1.getLifePoint());
                                            if(zombie1.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador1.Alive() == false){
                                            System.out.println("frankenstein gano aahhhh");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a frankensten");
                                        }
                                    }
                                    else{
                                        System.out.println("Frankenstan empieza primero");
                                        while (jugador1.Alive() != false | zombie1.Alive() != false) {
                                            zombie1.takeDamage(jugador1.atack());
                                            System.out.println(zombie1.getLifePoint());
                                            if(zombie1.Alive() == false){
                                                break;
                                            }
                                            jugador1.takeDamage(zombie1.atack());
                                            System.out.println(jugador1.getLivePoints());
                                            if (jugador1.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador1.Alive() == false){
                                            System.out.println("frankenstein gano aahhhh");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a frankensten");
                                        }
                                    }
                                break;
                                case 3:
                                    TheBigBoss DaddyYankee = new TheBigBoss("DaddyYanke", 250, 20, 2.0);
                                    DaddyYankee.ThreatheningPhrase();
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        while (jugador1.Alive() != false | DaddyYankee.Alive() != false) {
                                            jugador1.takeDamage(DaddyYankee.atack());
                                            System.out.println(jugador1.getLivePoints());
                                            if (jugador1.Alive() == false) {
                                                break;
                                            }
                                            DaddyYankee.takeDamage(jugador1.atack());
                                            System.out.println(DaddyYankee.getLifePoint());
                                            if(DaddyYankee.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador1.Alive() == false){
                                            System.out.println("el jefe te gano");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste al jefe ");
                                        }
                                    }
                                    else{
                                        while (jugador1.Alive() != false | DaddyYankee.Alive() != false) {
                                            DaddyYankee.takeDamage(jugador1.atack());
                                            System.out.println(DaddyYankee.getLifePoint());
                                            if(DaddyYankee.Alive() == false){
                                                break;
                                            }
                                            jugador1.takeDamage(DaddyYankee.atack());
                                            System.out.println(jugador1.getLivePoints());
                                            if (jugador1.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador1.Alive() == false){
                                            System.out.println("el jefe te gano");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste al jefe");
                                        }
                                    }
                                break;
                            }
                        }
                        while (!readKeyBoard2.equals("4"));
                        input3.close();
                    break;
                    case 2:
                        System.out.println("create un nombre, guerrero ");
                        Scanner attribute2 = new Scanner(System.in);
                        String name2 = attribute2.nextLine();
                        System.out.println("elije tu nivel: ");
                        Integer Level2 = attribute2.nextInt();
                        Warrior jugador2 = new Warrior(name2 , Level2 , 100 ,50);
                        Scanner input4 = new Scanner(System.in);
                        String readKeyBoard3;
                        do{
                            Opcions();
                            System.out.println("elige una opcion: ");
                            readKeyBoard3 = input4.nextLine();
                            Integer option4 = Integer.parseInt(readKeyBoard3);
                            Random numberrandom = new Random();
                            switch (option4) {
                                case 1:
                                    Vampire vampiro1 = new Vampire("dracula (bla bla blaa)", 100, 10);
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        System.out.println("Empiezas primero ");
                                        while (jugador2.Alive() != false | vampiro1.Alive() != false) {
                                            jugador2.takeDamage(vampiro1.atack());
                                            if (jugador2.Alive() == false) {
                                                break;
                                            }
                                            vampiro1.takeDamage(jugador2.atack());
                                            if(vampiro1.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador2.Alive() == false){
                                            System.out.println("dracula gano (bla bla blaa)");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a dracula siuuu");
                                        }
                                    }
                                    else{
                                        System.out.println("Dracula empieza primero ");
                                        while (jugador2.Alive() != false | vampiro1.Alive() != false) {
                                            vampiro1.takeDamage(jugador2.atack());
                                            if(vampiro1.Alive() == false){
                                                break;
                                            }
                                            jugador2.takeDamage(vampiro1.atack());
                                            if (jugador2.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador2.Alive() == false){
                                            System.out.println("dracula gano (bla bla blaa)");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a dracula siuuu");
                                        }
                                    }
                                break;
                                case 2:
                                    Zombie zombie1 = new Zombie("Frankenstain", 100, 10);
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        while (jugador2.Alive() != false | zombie1.Alive() != false) {
                                            jugador2.takeDamage(zombie1.atack());
                                            if (jugador2.Alive() == false) {
                                                break;
                                            }
                                            zombie1.takeDamage(jugador2.atack());
                                            if(zombie1.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador2.Alive() == false){
                                            System.out.println("frankenstein gano aahhhh");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a frankensten");
                                        }
                                    }
                                    else{
                                        while (jugador2.Alive() != false | zombie1.Alive() != false) {
                                            zombie1.takeDamage(jugador2.atack());
                                            if(zombie1.Alive() == false){
                                                break;
                                            }
                                            jugador2.takeDamage(zombie1.atack());
                                            if (jugador2.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador2.Alive() == false){
                                            System.out.println("frankenstein gano aahhhh");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a frankensten");
                                        }
                                    }
                                break;
                                case 3:
                                    TheBigBoss DaddyYankee = new TheBigBoss("DaddyYanke", 250, 20, 2.0);
                                    DaddyYankee.ThreatheningPhrase();
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        while (jugador2.Alive() != false | DaddyYankee.Alive() != false) {
                                            jugador2.takeDamage(DaddyYankee.atack());
                                            if (jugador2.Alive() == false) {
                                                break;
                                            }
                                            DaddyYankee.takeDamage(jugador2.atack());
                                            if(DaddyYankee.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador2.Alive() == false){
                                            System.out.println("el jefe te gano");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste al jefe ");
                                        }
                                    }
                                    else{
                                        while (jugador2.Alive() != false | DaddyYankee.Alive() != false) {
                                            DaddyYankee.takeDamage(jugador2.atack());
                                            if(DaddyYankee.Alive() == false){
                                                break;
                                            }
                                            jugador2.takeDamage(DaddyYankee.atack());
                                            if (jugador2.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador2.Alive() == false){
                                            System.out.println("el jefe te gano");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste al jefe");
                                        }
                                    }
                                break;
                            }
                        }
                        while (!readKeyBoard3.equals("4"));
                        input4.close();
                    break;
                    case 3:
                        System.out.println("create un nombre, mago: ");
                        Scanner attribute3 = new Scanner(System.in);
                        String name3 = attribute3.nextLine();
                        System.out.println("elije tu nivel: ");
                        Integer Level3 = attribute3.nextInt();
                        Wizhart jugador3 = new Wizhart(name3 , Level3 , 100 ,50);
                        Scanner input5 = new Scanner(System.in);
                        String readKeyBoard4;
                        do{
                            Opcions();
                            System.out.println("elige una opcion: ");
                            readKeyBoard4 = input2.nextLine();
                            Integer option5 = Integer.parseInt(readKeyBoard4);
                            Random numberrandom = new Random();
                            switch (option5) {
                                case 1:
                                    Vampire vampiro1 = new Vampire("dracula (bla bla blaa)", 100, 10);
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        System.out.println("Empiezas primero ");
                                        while (jugador3.Alive() != false | vampiro1.Alive() != false) {
                                            jugador3.takeDamage(vampiro1.atack());
                                            if (jugador3.Alive() == false) {
                                                break;
                                            }
                                            vampiro1.takeDamage(jugador3.atack());
                                            if(vampiro1.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador3.Alive() == false){
                                            System.out.println("dracula gano (bla bla blaa)");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a dracula siuuu");
                                        }
                                    }
                                    else{
                                        System.out.println("Dracula empieza primero ");
                                        while (jugador3.Alive() != false | vampiro1.Alive() != false) {
                                            vampiro1.takeDamage(jugador3.atack());
                                            if(vampiro1.Alive() == false){
                                                break;
                                            }
                                            jugador3.takeDamage(vampiro1.atack());
                                            if (jugador3.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador3.Alive() == false){
                                            System.out.println("dracula gano (bla bla blaa)");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a dracula siuuu");
                                        }
                                    }
                                break;
                                case 2:
                                    Zombie zombie1 = new Zombie("Frankenstain", 100, 10);
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        while (jugador3.Alive() != false | zombie1.Alive() != false) {
                                            jugador3.takeDamage(zombie1.atack());
                                            if (jugador3.Alive() == false) {
                                                break;
                                            }
                                            zombie1.takeDamage(jugador3.atack());
                                            if(zombie1.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador3.Alive() == false){
                                            System.out.println("frankenstein gano aahhhh");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a frankensten");
                                        }
                                    }
                                    else{
                                        while (jugador3.Alive() != false | zombie1.Alive() != false) {
                                            zombie1.takeDamage(jugador3.atack());
                                            if(zombie1.Alive() == false){
                                                break;
                                            }
                                            jugador3.takeDamage(zombie1.atack());
                                            if (jugador3.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador3.Alive() == false){
                                            System.out.println("frankenstein gano aahhhh");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste a frankensten");
                                        }
                                    }
                                break;
                                case 3:
                                    TheBigBoss DaddyYankee = new TheBigBoss("DaddyYanke", 250, 20, 2.0);
                                    DaddyYankee.ThreatheningPhrase();
                                    if(numberrandom.nextInt(2) + 1 == 1){
                                        while (jugador3.Alive() != false | DaddyYankee.Alive() != false) {
                                            jugador3.takeDamage(DaddyYankee.atack());
                                            if (jugador3.Alive() == false) {
                                                break;
                                            }
                                            DaddyYankee.takeDamage(jugador3.atack());
                                            if(DaddyYankee.Alive() == false){
                                                break;
                                            }
                                        }
                                        if (jugador3.Alive() == false){
                                            System.out.println("el jefe te gano");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste al jefe ");
                                        }
                                    }
                                    else{
                                        while (jugador3.Alive() != false | DaddyYankee.Alive() != false) {
                                            DaddyYankee.takeDamage(jugador3.atack());
                                            if(DaddyYankee.Alive() == false){
                                                break;
                                            }
                                            jugador3.takeDamage(DaddyYankee.atack());
                                            if (jugador3.Alive() == false) {
                                                break;
                                            }
                                        }
                                        if (jugador3.Alive() == false){
                                            System.out.println("el jefe te gano");
                                            break;
                                        }
                                        else{
                                            System.out.println("venciste al jefe");
                                        }
                                    }
                                break;
                            }
                        }
                        while (!readKeyBoard4.equals("4"));
                        input5.close();
                        break;
                }
            }
        }    
        while (!readKeyBoard.equals("3"));
        input1.close();
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
        System.out.println("4. salir");
    }
    public static void characterOptions(){
        System.out.println("1. arquero");
        System.out.println("2. guerrero");
        System.out.println("3. mago");
    }
}