import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {

        //challengeSwitch("a");
        //printNumberInWord(5);
        //calculateInterest(10000.0, 4.0);
//        for (int i=8; i>1; i--){
//            System.out.println("Result for your amount with interest rate " + i + "% is " +
//                    calculateInterest(10000.0, i)); //String.format("%.2f",method_name) to avoid precision
//        }
//        int count = 0;
//        for (int i=10; i<50; i++){
//            if (isPrime(i)){
//                count++;
//                System.out.println("Number " + i + " is a prime number");
//                if (count == 10){
//                    System.out.println("Existing for loop");
//                    break;
//                }
//            }
//        }
//        circle();
//        int number = 4;
//        int finishNumber = 20;
//        int count = 0;
//        while (number <= finishNumber){
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number is " + number);
//
//            count++;
//            if (count >= 5){
//                break;
//            }
//        }
//        System.out.println("Total numbers found " + count);
//        System.out.println("Digits sum of number 321 is " + sumDigits(32123));
//        System.out.println("Entered number is a palindrome " + isPalindrome(-121));
//        System.out.println("Result is " + canPack(1, 0, 6));
//            scanner();
//        readingUserInput();
        minAndMaxInput();
    }

    public static void challengeSwitch (String a){
        String charValue = a;
        switch (charValue.toLowerCase()){
            case "a":
                System.out.println("It was - A");
                break;

            case "b":
                System.out.println("It was - B");
                break;

            case "c": case "d": case "e":
                System.out.println("Value was found");
                System.out.println("It was - " + charValue);
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }

    public static void printNumberInWord (int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static double calculateInterest (double amount, double interestRate){
        return(amount*(interestRate/100));
    }

    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            System.out.println("Looping " + i);
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void circle (){
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 1001; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Number " + i + " could be divided with 3 and 5 without reminder");
                sum = sum + i;
                System.out.println(sum);
                count++;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Finish, sum is " + sum);
    }

    public static void doWhile (){
        int count = 1;
        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;

            if (count > 100){
                break;
            }

        } while (count != 6);
    }

    public static boolean isEvenNumber (int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits (int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number >0){
        int digit = number % 10;
        sum += digit;
            System.out.println("Number for sum is " + number);
        number/= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        if (number < 0){
            number *= (-1);
        }
        int compare = number;

        while (number > 0){
            int digit = number % 10;
            number /= 10;
            reverse += digit;
            reverse *= 10;
        }

        reverse /= 10;
        if (compare != reverse){
            return false;
        } else {
        return true;
        }
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if (goal > bigCount*5 + smallCount){
            return false;
        } else if (goal % 5 > smallCount){
            return false;
        }
        return true;
    }

    public static void scanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            int age = 2018 - yearOfBirth;
            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }

    public static void readingUserInput (){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count < 11){
            System.out.print("Enter number #" + count + ": ");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt){
                int number = sc.nextInt();
                count ++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println("Sum is " + sum);
    }

    public static void minAndMaxInput (){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true){
            System.out.print("Enter number: ");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt){
                int number = sc.nextInt();

                if (number < min){
                    min = number;
                }

                if (number > max){
                    max = number;
                }

            } else {
                break;
            }
        }
        System.out.println("Maximum is " + max + ". Minimum is " + min);
    }
}
