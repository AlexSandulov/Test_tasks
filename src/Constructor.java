public class Constructor {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Constructor (){
        this("258741", 2.80, "Default name", "Default " +
                        "email","Default phone");
        System.out.println("Empty constructor called");
    }

    public  Constructor (String number, double balance, String customerName, String email,
                         String phoneNumber){
        System.out.println("Account constructor with params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Constructor(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Your balance after deposit " + depositAmount + " now is " +
                this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available");
        } else {
        this.balance -= withdrawalAmount;
        System.out.println("Your balance after withdrawal " + withdrawalAmount + " now is " +
                this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
