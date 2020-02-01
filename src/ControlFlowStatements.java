public class ControlFlowStatements {
    public static void main(String[] args) {

        //challengeSwitch("a");
        //printNumberInWord(5);
        //calculateInterest(10000.0, 4.0);
//        for (int i=8; i>1; i--){
//            System.out.println("Result for your amount with interest rate " + i + "% is " +
//                    calculateInterest(10000.0, i)); //String.format("%.2f",method_name) to avoid precision
//        }
        int count = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
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
            if (n % 1 == 0){
                return false;
            }
        }
        return true;
    }
}
