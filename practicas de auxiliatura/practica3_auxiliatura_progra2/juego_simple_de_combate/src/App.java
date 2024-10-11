import Personajes.*;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random level = new Random();
        Wizhart DeOz = new Wizhart("DeOz", level.nextInt(9) + 1 , 100 , 48);
        Warrior Leonidas =new Warrior("Leonidas",(level.nextInt(9) + 1),100, 300);
        System.out.println("Inicio de la simulacion");
        Random random = new Random(); 
        Integer number = random.nextInt(2) + 1;
        System.out.println(number);
        if ( number == 1) {
            System.out.println(DeOz.getLivePoints());
            System.out.println(Leonidas.getLivePoints());
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
            System.out.println(DeOz.getLivePoints());
            System.out.println(Leonidas.getLivePoints());
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
    }
}
