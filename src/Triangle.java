import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
// Sqrt(p*(p-a)*(p-b)*(p-c)) , p = (a+b+c)/2
        System.out.print("Please, enter information about first triangle - name, a_side_" +
                "length, b_side_length, c_side_length: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] data = input.split(", ");
        String name = data[0];
        System.out.println(name);
        String a = data[1];
//        double b = data[3];
//        double c = sc.nextDouble();
//        double square = squareCalc(a, b, c);
//        displayResult(name, square);

    }

    public static double squareCalc (double a, double b, double c){
        double squareCalc = 0;
        squareCalc = Math.sqrt(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*
                ((a+b+c)/2-c));
        return squareCalc;
    }

    public static void displayResult (String name, double square){
        System.out.println("Triangle " + name + " " + square);
    }
}
