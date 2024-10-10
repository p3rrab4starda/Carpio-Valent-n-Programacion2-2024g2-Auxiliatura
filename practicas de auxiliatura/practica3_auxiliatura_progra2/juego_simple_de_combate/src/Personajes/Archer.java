package Personajes;

public class Archer extends Persons {
    private Integer Skill;
    public Archer(String Name, Integer Level , Integer LifePoints , Integer Skill){
        super(Name, Level, LifePoints);
        this.Skill = Skill;
    }
    public Integer getSkill() {
        return Skill;
    }
    public void setSkill(Integer skill) {
        Skill = skill;
    }
    public void shotArrow(){
        System.out.println("el arquero disparo una flecha");
    }
}
