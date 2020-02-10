public class VipConstructor {

    private String name;
    private double creditLimit;
    private String email;

    public VipConstructor(){
        this("Default name", 0.00, "Default email");
        System.out.println("Empty constructor called");
    }

    public VipConstructor(String name, double creditLimit){
        this(name, creditLimit, "Default email");
        System.out.println("Two variables constructor called");
    }

    public VipConstructor(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("All variables constructor called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
