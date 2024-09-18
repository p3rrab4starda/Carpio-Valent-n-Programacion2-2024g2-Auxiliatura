import Math.Vector;
import Math.VectorOperation;

public class App {
    public static void main(String[] args) throws Exception {
        VectorOperation operation = new VectorOperation();
        Vector a = new Vector(34, 56);
        Vector b = new Vector(6, 34); 
        Integer result1 = operation.add(34, 3);
        Vector vectorResult1 = operation.add(a, b);
        operation.print(result1);
        operation.print(vectorResult1);
        Integer result2 = operation.subtract(34, 3);
        Vector vectorResult2 = operation.subtract(a, b);
        operation.print(result2);
        operation.print(vectorResult2);
        Integer result3 = operation.multiply(34, 3);
        double vectorResult3 = operation.multiply(a, b);
        operation.print(result3);
        operation.print(vectorResult3);
        Integer result4 = operation.division(34, 3);
        Vector vectorResult4 = operation.scalarMultiply(a, 3);
        operation.print(result4);
        operation.print(vectorResult4);
    }
}