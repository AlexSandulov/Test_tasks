public class Exercises {
    public static void main(String[] args) {
        //printMegaBytesAndKiloBytes(5000);
        //shouldWakeUp(true, 0);
        isLeapYear(2017);
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
}
