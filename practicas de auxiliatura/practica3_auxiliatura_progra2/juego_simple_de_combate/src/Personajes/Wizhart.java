package Personajes;

public class Wizhart extends Persons{
    private Integer Mana;
    public Wizhart(String Name, Integer Level , Integer LifePoints , Integer Mana){
        super(Name, Level, LifePoints);
        this.Mana = Mana;
    }
    public Integer getMana() {
        return Mana;
    }
    public void setMana(Integer mana) {
        Mana = mana;
    }
    public void castSpell(){
        System.out.println("el mago lanzo un hechizo");
    }
}
