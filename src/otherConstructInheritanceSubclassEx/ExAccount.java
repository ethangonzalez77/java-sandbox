package otherConstructInheritanceSubclassEx;

public class ExAccount {
    public static void main(String[] args) {

        Account et = new Account();

        et.setNumber("24");
        et.setBalance(100);
        et.setCustomerName("elee");
        et.setCustomerPhoneNumber("000-111-222-3333");
        et.setCustomerEmailAddress("el00774@gmail.com");

        System.out.println(et.getNumber());
        System.out.println(et.getBalance());
        System.out.println(et.getCustomerName());
        System.out.println(et.getCustomerPhoneNumber());
        System.out.println(et.getCustomerEmailAddress());

        //now with the constructor

        System.out.println("-------------------------------------");

        Account a1 = new Account("11", 50, "alpha", "alpha@gmail.com", "000-111-000-1111");

        System.out.println(a1.getNumber());
        System.out.println(a1.getBalance());
        System.out.println(a1.getCustomerName());
        System.out.println(a1.getCustomerEmailAddress());
        System.out.println(a1.getCustomerPhoneNumber());

        //now with an empty constructor that has default values that are applied to the Class's fields

        System.out.println("-------------------------------------");


        Account a2 = new Account();

        System.out.println(a2.getNumber());
        System.out.println(a2.getBalance());
        System.out.println(a2.getCustomerName());
        System.out.println(a2.getCustomerEmailAddress());
        System.out.println(a2.getCustomerPhoneNumber());























    }
}
