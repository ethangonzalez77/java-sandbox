package encapsulation.printerChallenge;

public class MainPrinter {

    public static void main(String[] args) {

        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.


        Printer p1 = new Printer(90, true);//try switching false to see what happens


        p1.printPapers(5);
        System.out.println("Total papers printed are " + p1.getPagesPrinted());

        p1.addToner(9);












    }
}
