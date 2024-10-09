package Personajes;

public class Inventory {
    private String name;
    public Inventory(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    ///public Inventory add(String name){
    //    Inventory Item = new Inventory(name);
    //    return Item;
    ///}
    public void print(){
        System.out.println("tus items son: " + getname());
    }
}
