package Point;

import javax.swing.JOptionPane;

public class Point {
    float CoordenateX;
    float CoordenateY;
    float CoordenateZ;
    public void EnterCoordinates(String mesage ) {
        CoordenateX = Float.parseFloat(JOptionPane.showInputDialog(mesage + "\n Escribir coordenada x"));
        CoordenateY = Float.parseFloat(JOptionPane.showInputDialog(mesage + "\n Escribir coordenada y"));
        CoordenateZ = Float.parseFloat(JOptionPane.showInputDialog(mesage + "\n Escribir coordenada z"));
    }
    public void MostrarPuntos(String mesage){
        JOptionPane.showMessageDialog(null, mesage + "\n(" + CoordenateX + "," + CoordenateY + "," + CoordenateZ + ")");
    }
    public double Distance(Point point){
        return Math.sqrt(Math.pow((point.CoordenateX - CoordenateX), 2) + Math.pow((point.CoordenateY - CoordenateY), 2) + Math.pow((point.CoordenateZ - CoordenateZ), 2));
    }
}