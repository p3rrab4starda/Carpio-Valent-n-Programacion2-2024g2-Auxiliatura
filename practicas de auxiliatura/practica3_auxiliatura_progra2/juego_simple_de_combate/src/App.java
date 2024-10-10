import Inventory.Inventory;
import Personajes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Persons Santiago = new Persons("Santiago",1, 100);
        Inventory Item = new Inventory("stone");
        Item.addItem(Item);
        Inventory crafter = new Inventory("crafter");
        Item.addItem(crafter);
        Item.printItems();
        Santiago.printStatus();
        Santiago.takeDamage(10);
        Santiago.printStatus();
        Santiago.cure();
        Santiago.printStatus();
    }
}
