import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        String exit;
        do {
            System.out.print("Please, enter information about first triangle - name, a_side_" +
                    "length, b_side_length, c_side_length: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] data = input.split(", ");
            String name = data[0];
            Double a = Double.parseDouble(data[1]);
            Double b = Double.parseDouble(data[2]);
            Double c = Double.parseDouble(data[3]);
            double square = squareCalc(a, b, c);
            if (square > 0){
                System.out.println("Do you want to enter new triangle? (yes/no)");
            } else {
                System.out.println("Entered dimensions are not correct");
            }
            exit = sc.next();
        } while (exit.equals("y") || exit.equals("yes"));
        //displayResult(name, square);
    }

    public static double squareCalc (double a, double b, double c){
        double squareCalc = 0;
        squareCalc = Math.sqrt(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*
                ((a+b+c)/2-c));
        return squareCalc;
    }

    public static void displayResult (String name, double square){
        System.out.println("============= Triangles list: ===============");
        System.out.println("[Triangle " + name + "]: " + square + " cm");
    }
}
