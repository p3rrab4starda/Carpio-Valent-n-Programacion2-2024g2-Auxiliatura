import Vehicle.*;


public class App {
    public static void main(String[] args) throws Exception {
        electricVehicle myEV = new electricVehicle("Tesla", "Model 3", 50000, 75, 500);
        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();
    }
}
