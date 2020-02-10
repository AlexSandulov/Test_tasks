package Inheritance;

public class Main {

    public static void main(String[] args) {

//        Combi combi = new Combi(36);
//        combi.steer(40);
//        combi.accelerate(30);
//        combi.accelerate(20);
//        combi.accelerate(-42);

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }
}
