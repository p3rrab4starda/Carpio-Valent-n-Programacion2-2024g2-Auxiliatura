package Enemy;
import java.util.Random;

public class TheBigBoss extends Enemy{
    private Double Multipliciti;
    public TheBigBoss(String Name , Integer LifePoint , Integer BaseDamage , Double Multipliciti){
        super(Name, LifePoint, BaseDamage);
        this.Multipliciti = Multipliciti;
    }
    public Double getMultipliciti() {
        return Multipliciti;
    }
    public void setMultipliciti(Double multipliciti) {
        Multipliciti = multipliciti;
    }
    public void ThreatheningPhrase(){
        System.out.println("tenemo algo pendiente, tu me debe algo y lo sabe ");
    }
    public Double criticalAtack(){
        Random Damage = new Random();
        return (Damage.nextInt(10) + 10) * getMultipliciti();
    }
}
