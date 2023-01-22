package otherConstructInheritanceSubclassEx;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public void deposit (double userBalance) {


        this.balance += userBalance;
        System.out.println(userBalance + " is how much you added to your account.");
        System.out.println(this.balance + " is now in " + this.customerName + " account.");


    }


    public void withdrawal (double userWithdrawal) {


        if (this.balance - userWithdrawal < 0) {

            System.out.println("Sorry can't withdrawal that amount.");
            System.out.println("You requested " + userWithdrawal);
            System.out.println("You only have " + this.balance + " in your account");

        }else {

            this.balance -= userWithdrawal;

            System.out.println(userWithdrawal + " is how much you requested.");
            System.out.println(this.balance + " Is how much you have left in your account.");
        }


    }








    public Account() {

        this("0", 0, "No Name", "noName@nowhere.com", "No Phone Number");

    }


    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
