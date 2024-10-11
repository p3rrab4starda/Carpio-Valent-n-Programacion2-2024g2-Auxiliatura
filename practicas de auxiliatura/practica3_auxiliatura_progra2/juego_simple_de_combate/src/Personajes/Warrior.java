package Personajes;

public class Warrior extends Persons{
    private Integer Force;
    public Warrior(String Name, Integer Level , Integer LifePoints , Integer Force){
        super(Name, Level, LifePoints);
        this.Force = Force;
    }
    public Integer getForce() {
        return Force;
    }
    public void setForce(Integer force) {
        Force = force;
    }
    public void castSpell(){
        System.out.println("THIS IS SPARTAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
