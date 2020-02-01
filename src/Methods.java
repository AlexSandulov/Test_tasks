import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Methods {

    private static String INVALID_MESSAGE_VALUE = "Invalid Value";

    public static void main(String[] args) {
//        int newScore = calculateScore("ABC", 300);
//        System.out.println(newScore);
//        calculateScore(40);

//        double centimeters = calcFeetAndInchesToCentimeters(6, 5);
//        if (centimeters < 0.0){
//            System.out.println("Invalid params");
//        }
//
//        //calcFeetAndInchesToCentimeters(157);
        //getDurationString(3665);
        printYearsAndDays(-365000);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid inches value");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches is equal to "+ centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid params");
            return -1;
        }
        double feet = (int) inches / 12;
        double remaining = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remaining + " inches");
        return calcFeetAndInchesToCentimeters(feet, remaining);
    }

    public static String getDurationString (int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return INVALID_MESSAGE_VALUE;
        }
        int hours = minutes / 60;
        int remaining = minutes % 60;
        System.out.println(hours + "h " + remaining + "m " + seconds + "s");
        return hours + "h " + remaining + "m " + seconds + "s";
    }

    public static String getDurationString (int seconds){
        if (seconds < 0){
            return INVALID_MESSAGE_VALUE;
        }
        int minutes  = seconds / 60;
        int remaining = seconds % 60;
        System.out.println(minutes + "m " + remaining + "s");
        return getDurationString(minutes, remaining);
    }

    public static double area (double radius){
        if (radius < 0){
            System.out.println("Invalid value");
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area (double x, double y){
        if ((x < 0) || (y < 0)){
            System.out.println("Invalid value");
            return -1;
        }
        return x * y;
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long days = day % 365;
            System.out.println(minutes + " min " + "= " + year + " y " + "and " + days + " d");
        }
    }
}
