package Math;

public class VectorOperation extends BaseOperation{
    private Vector result;
    public Vector add(Vector a, Vector b) {
        Integer resultX = a.getX() + b.getX();
        Integer resultY = a.getY() + b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    public Vector subtract(Vector a, Vector b) {
        Integer resultX = a.getX() - b.getX();
        Integer resultY = a.getY() - b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    public double multiply (Vector a, Vector b) {
        Integer x = b.getX() - a.getX();
        Integer y = b.getY() - a.getY();
        return Module(a.getX(), a.getY()) * Module(b.getX(), b.getY()) * Math.sin(Math.acos(Module(x, y) - Module(a.getX(), a.getY()) - Module(b.getX(), b.getY()) * Math.pow(2 * Module(a.getX(), a.getY()) * Module(b.getX(), b.getY()), -1)));
    }
    public Vector scalarMultiply(Vector a, Integer b ) {
        Integer resultX = a.getX() * b;
        Integer resultY = a.getY() * b;
        result = new Vector(resultX, resultY);
        return result;
    }
    public double Module(Integer x, Integer y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public void print(Vector vectorResult) {
        System.out.println("Result = " + vectorResult);
    }
}