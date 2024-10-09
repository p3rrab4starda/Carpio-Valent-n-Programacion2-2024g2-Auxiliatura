import Personajes.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Inventory Stone = new Inventory("stone");
        ArrayList<Inventory> Items = new ArrayList();
        Items.add(Stone);
        Personajes.printItems();
    }
}
