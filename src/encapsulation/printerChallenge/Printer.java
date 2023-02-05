package encapsulation.printerChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel,  boolean duplex) {


        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }


        this.duplex = duplex;


    }







    public void printPapers (int papers) {

        this.pagesPrinted = (papers / 2) + (papers % 2);

    }







    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
