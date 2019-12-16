import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
// Sqrt(p*(p-a)*(p-b)*(p-c)) , p = (a+b+c)/2
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter information about first triangle - name, a_side_" +
                "length, b_side_length, c_side_length: ");
//        String [] num = num String[4];
//        num[] = sc.next();
        String name = sc.next();
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double r1 = Math.sqrt(((a1+b1+c1)/2)*((a1+b1+c1)/2-a1)*((a1+b1+c1)/2-b1)*
                ((a1+b1+c1)/2-c1));
        System.out.println("Triangle " + name + " " + r1);
    }
}
