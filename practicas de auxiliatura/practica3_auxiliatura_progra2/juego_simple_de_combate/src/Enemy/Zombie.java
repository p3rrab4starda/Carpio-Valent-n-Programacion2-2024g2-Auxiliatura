package Enemy;

import java.util.Random;

public class Zombie extends Enemy{
    public Zombie(String Name , Integer LifePoint , Integer BaseDamage){
        super(Name, LifePoint, BaseDamage);
    }
    public Integer atack(){
        setLifePoint(this.getLifePoint() + 5);
        Random Damage = new Random();
        return Damage.nextInt(10) + 10;
    }
}
