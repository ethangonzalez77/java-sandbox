package otherConstructInheritanceSubclassEx.VipEx;

public class VipPerson {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters won't be needed
    // test and confirm it works.

    private String name;
    private double creditLimit;
    private String email;

    public VipPerson() {
        this("No Name", 9000, "NoEmail@gmail.com");
    }

    public VipPerson(String name) {
        this(name, 9000, "NoEmail@gmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "NoEmail@gmail.com");
    }

    public VipPerson(String name, String email) {
        this(name, 9000, email);
    }

    public VipPerson(double creditLimit, String email) {
        this("No Name", creditLimit, email);
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
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
