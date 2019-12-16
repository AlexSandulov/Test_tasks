public class Training {
    public static void main (String[] args){
        byte newByte = 16;
        short newShort = 2;
        int newInt = 100;
        long longTotal = 50000L + 10L * (newByte + newShort + newInt);
        //System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (newByte + newInt + newShort));
        //System.out.println(shortTotal);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Float.MIN_VALUE;
        double myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        float myFloatValue = (float) 5.25;
        int myIntValue = (int) 4.5;
        double myDoubleValue = 3.35d;
        System.out.println(myIntValue);

        double poundsNumber = 200;
        double kiloNumbers = poundsNumber * 0.45359237;
        double anotherNumber = 3_000_000.2_254_258d;
        System.out.println("Converted kilograms = " + kiloNumbers);
        System.out.println(anotherNumber);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCpyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCpyrightChar);
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);

        int result = 1 + 1;
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 1;
        System.out.println(result);
        result -= 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 2;
        System.out.println(result);

        boolean isHuman = false;
        int topScore = 82;
        if (topScore <= 100) {
            System.out.println("Win!!!");
            System.out.println("It is the truth"); // in case with true
        } else
            System.out.println("Fail");

        int newScore = 81;
        if ((topScore > newScore) || (topScore < 100)){
            System.out.println("Wow, it works!");

            int newValue = 50;
            if (newValue == 50){
                System.out.println("smthng");
            }
        }

            boolean isCar = false;
            if (!isCar){ // isCar != true
                System.out.println("Doesn't work here");
            }

            isCar = true;
            boolean wasCar = isCar ? true : false; // check the value
            if (wasCar){
                System.out.println("True");
            }

        System.out.println("__________________________");
            double doubleOne = 35d;
            double doubleTwo = 20.00;
            double doubleSum = (doubleOne + doubleTwo) * 1;
        System.out.println("Double Sum value is " + doubleSum);
            double reminder = doubleSum % 40.00d;
        System.out.println("Reminder is " + reminder);
            boolean isNtReminder = (reminder == 0) ? true : false;
            System.out.println("Not Reminder - " + isNtReminder);
            if (!isNtReminder) {
                System.out.println("Got some reminder");
            }
    }
}
