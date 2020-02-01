public class Exercises {
    public static void main(String[] args) {
        //printMegaBytesAndKiloBytes(5000);
        //shouldWakeUp(true, 0);
        //isLeapYear(2017);
        //areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        //hasEqualSum(1, -1, 0);
        //hasTeen(22, 23, 34);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
//            int megaBytes = kiloBytes/1024;
//            int reminder = kiloBytes % 1024;
//            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " +
//                    reminder + " KB");
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " MB and " +
                    kiloBytes%1024 + " KB");
        }
    }

    public static void shouldWakeUp (boolean barking, int hourOfDay) {
        boolean shouldWakeUp = false;
        if ((hourOfDay < 0) || (hourOfDay > 23)){
            shouldWakeUp = false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking){
            shouldWakeUp = true;
        }
        //return shouldWakeUp; used with boolean method
        System.out.println(shouldWakeUp);
    }

    public static void isLeapYear (int year){
        if (year >= 1 && year <= 9999){
            if (year%4 == 0 && year%100 == 0){
                System.out.println("true");
            } else if (year%4 == 0 && year%400 == 0){
                System.out.println("true");
            }
        } else {
        System.out.println("false");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
        int castedFirstParam = (int) (a*1000);
        int castedSecondParam = (int) (b*1000);
        if (castedFirstParam == castedSecondParam){
            System.out.println("True");
            return true;
        } else {
            System.out.println("True");
            return false;
        }
    }

    public static boolean hasEqualSum (int a, int b, int c){
        if ((a+b) == c){
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean hasTeen (int firstAge, int secondAge, int thirdAge) {
        if (firstAge >= 13 && firstAge <= 19){
            System.out.println(firstAge + " True");
            return true;
        } else if (secondAge >= 13 && secondAge <= 19){
            System.out.println(secondAge + " True");
            return true;
        } else if (thirdAge >= 13 && thirdAge <= 19){
            System.out.println(thirdAge + " True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
