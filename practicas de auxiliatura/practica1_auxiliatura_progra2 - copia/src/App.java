import java.util.Scanner;

import javax.swing.JOptionPane;

import Point.Point;
public class App {
    public static void main(String[] args) throws Exception {
        Point Point1 = new Point();
        Point Point2 = new Point();
        Point1.EnterCoordinates("Punto 1");
        Point2.EnterCoordinates("Punto 2");
        Point1.MostrarPuntos("Punto 1");
        Point2.MostrarPuntos("Punto 2");
        JOptionPane.showMessageDialog(null, "La distancia es igual a: " + Point1.Distance(Point2));
        try(Scanner Variables = new Scanner(System.in)){
            int CuadraticTerm;
            System.out.println("digite el numero cuadratico: ");
            CuadraticTerm = Variables.nextInt();
            int LinealTerm;
            System.out.println("digite el numero lineal: ");
            LinealTerm = Variables.nextInt();
            int IndependentTerm;
            System.out.println("digite el numero independiente: ");
            IndependentTerm = Variables.nextInt();
            SolveSquareFunction(CuadraticTerm, LinealTerm, IndependentTerm);
            float ratio;
            System.out.println("coloque el radio de la esfera: ");
            ratio = Variables.nextFloat();
            System.out.println(Area(ratio));
            System.out.println(Volume(ratio));
            int Number1;
            System.out.println("introduzca un numero para calcular el maximo comun divisor: ");
            Number1 = Variables.nextInt();
            int Number2;
            System.out.println("introduzca otro numero para calcular el maximo comun divisor: ");
            Number2 = Variables.nextInt();
            System.out.println(MaximoComunDivisor(Number1, Number2));
            float PrincipalMount;
            System.out.println("introduzca el monto principal: ");
            PrincipalMount = Variables.nextFloat();
            float InterestRate;
            System.out.println("introduzca la taza del interes que desea aplicar (en decimal 1% = 0.01): ");
            InterestRate = Variables.nextFloat();
            int ApplicableOfInterest;
            System.out.println("introduzca el numero de veces que aplicara el interes: ");
            ApplicableOfInterest = Variables.nextInt();
            int Time;
            System.out.println("introduzca el tiempo en years: ");
            Time = Variables.nextInt();
            System.out.println(CompountInterest(PrincipalMount, InterestRate, ApplicableOfInterest, Time));
            int Maximum;
            System.out.println("introduzca la cota maxima: ");
            Maximum = Variables.nextInt();
            int Minimum;
            System.out.println("introduzca la cota minima: ");
            Minimum = Variables.nextInt();
            System.out.println(Random(Maximum, Minimum));
            float Ratio;
            System.out.println("introduzca la coordenada radio: ");
            Ratio = Variables.nextFloat();
            float Angle;
            System.out.println("introduzca el angulo en pi radianes: ");
            Angle = Variables.nextFloat();
            System.out.println(TransformLinealX(Ratio, Angle));
            System.out.println(TransformLinealY(Ratio, Angle));
            System.out.println("simulacion del tiro de 2 dados");
            System.out.println(Dado());
            System.out.println(Dado());
            int Number;
            System.out.println("introduzca el numero tope: ");
            Number = Variables.nextInt();
            System.out.println("la probabilidad de que la suma de los 2 lanzamientos salga tu numero es: " + SumOfProbability(Number));
            int Termin;
            System.out.println("introduzca el numero de terminos para la serie pi: ");
            Termin = Variables.nextInt();
            System.out.println("la aproximacion de pi es: " + SeriePi(Termin)*4);
        }
    }
    public static void SolveSquareFunction(int cuadratico ,int lineal ,int independiente){
        double solve1 = ((-lineal + Math.sqrt(Math.pow(lineal, 2) - 4*cuadratico*independiente))/(2*cuadratico));
        double solve2 = ((-lineal - Math.sqrt(Math.pow(lineal, 2) - 4*cuadratico*independiente))/(2*cuadratico));
        System.out.println("solve1: " + solve1);
        System.out.println("solve2: " + solve2);
    }
    public static double Area(float radio){
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    public static double Volume(float radio){
        return (4 * Math.PI * Math.pow(radio, 3))/3;
    }
    public static int MaximoComunDivisor(int number1, int number2){
        int auxiliar;
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        while ((number1 % number2) > 0) {
            auxiliar = number1;
            number1 = number2;
            number2 = auxiliar % number2;
        }
        return number2;
    }
    public static double CompountInterest(float PrincMount, float Rate, int Applicable, int Time){
        return PrincMount * (Math.pow((1 - (Rate/Applicable)), (Applicable * Time)));
    }
    public static double Random(int Maximum, int Minimum){
        return (int)(Math.random()*(Maximum - Minimum) + Minimum);
    }
    public static double TransformLinealX(float Ratio, float Angle){
        return (Math.abs(Ratio)) * Math.cos((Math.abs(Angle) * Math.PI));
    }
    public static double TransformLinealY(float Ratio, float Angle){
        return (Math.abs(Ratio)) * Math.sin((Math.abs(Angle) * Math.PI));
    }
    public static double ProbabilityOF2DiceRoll(int Number) {
        int FavorableCase = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (Number == (i + j)) {
                    FavorableCase += 1;
                }
            }            
        }
        return FavorableCase * Math.pow(36, -1);
    }
    public static double Dado(){
        return (int)(Math.random()*(6 - 1) + 1);
    }
    public static double SumOfProbability(int Number){
        double TotalProbability = 0;
        for (int i = Number; i <= 12; i++) {
            TotalProbability = TotalProbability + (ProbabilityOF2DiceRoll(i));
        }
        return TotalProbability;
    }
    public static double SeriePi(int Termin){
        double Summation = 0;
        for (int i = 1; i < Termin; i++) {
            Summation = Summation + (Math.pow(-1, (i + 1))) * (1 * Math.pow((2 * i) - 1, -1));
        }
        return Summation;
    }
}  