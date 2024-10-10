package Personajes;

public class Persons {
    private String Name;
    private Integer Level;
    private Integer LifePoints;
    
    public Persons (String Name, Integer Level , Integer LifePoints){
        this.Name = Name;
        this.Level = Level;
        this.LifePoints = LifePoints;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public Integer getLevel(){
        return Level;
    }
    public void setLevel(Integer Level){
        this.Level = Level;
    }
    public Integer getLivePoints(){
        return LifePoints;
    }
    public void setLifePoints(Integer LifePoints){
        this.LifePoints = LifePoints;
    }
    public void printStatus(){
        System.out.println(this.Name + " tienes " + this.LifePoints + " de vida");
        System.out.println("estas en el nivel " + this.Level);
    }
    public void takeDamage(Integer takeDamage){
        this.LifePoints = LifePoints - takeDamage;
    }
    public void cure(){
        if(80 < LifePoints){
            this.LifePoints = 100;
        }
        else{
            this.LifePoints = LifePoints + 20;
        }
    }
}
