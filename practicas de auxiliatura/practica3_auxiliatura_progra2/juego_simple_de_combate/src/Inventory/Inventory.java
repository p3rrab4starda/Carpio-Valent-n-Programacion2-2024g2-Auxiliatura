package Inventory;
import java.util.ArrayList;

public class Inventory {
    private String name;
    private ArrayList<Inventory> item;
    
    public Inventory(String name){
        this.name = name;
        this.item = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Inventory> getItem() {
        return item;
    }
    public void setItem(ArrayList<Inventory> item) { 
        this.item = item;
    }
    public void addItem(Inventory name){
        this.item.add(name);
    }
    public void printItems(){
        for (Inventory Item : this.item) {
            System.out.println("tus items son: " + Item.getName());   
        }
    }
}
