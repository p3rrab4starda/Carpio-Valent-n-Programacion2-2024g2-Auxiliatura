package Enemy;
import java.util.Random;;

public class Vampire extends Enemy{
    public Vampire(String Name , Integer LifePoint , Integer BaseDamage){
        super(Name, LifePoint, BaseDamage);
    }
    public Integer atack(){
        Random Damage = new Random();
        Integer damage = Damage.nextInt(10) + 10;
        setLifePoint(damage/2);
        return damage;
    }
}
