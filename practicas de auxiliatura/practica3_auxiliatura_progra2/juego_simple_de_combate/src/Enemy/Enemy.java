package Enemy;

import java.util.Random;

public class Enemy {
    private String Name;
    private Integer LifePoint;
    private Integer BaseDamage;
    public Enemy(String Name , Integer LifePoint , Integer BaseDamage){
        this.Name = Name;
        this.LifePoint = LifePoint;
        this.BaseDamage = BaseDamage;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Integer getLifePoint() {
        return LifePoint;
    }
    public void setLifePoint(Integer lifePoint) {
        LifePoint = lifePoint;
    }
    public Integer getBaseDamage() {
        return BaseDamage;
    }
    public void setBaseDamage(Integer baseDamage) {
        BaseDamage = baseDamage;
    }
    public Integer atack(){
        Random Damage = new Random();
        return Damage.nextInt(10) + 10;
    }
    public void takeDamage(Integer takeDamage){
        this.LifePoint = LifePoint - takeDamage;
    }
    public boolean Alive(){
        if (getLifePoint() > 1) {
            return true;
        }
        else{
            return false;
        }
    }
}
