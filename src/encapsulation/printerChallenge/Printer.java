package encapsulation.printerChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel,  boolean duplex) {


        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }


        this.duplex = duplex;
        this.pagesPrinted = 0;


    }







    public int printPapers (int papers) {


        if (duplex) {

            this.pagesPrinted += (papers / 2) + (papers % 2);

        }else {
            this.pagesPrinted += papers;
        }


        return this.pagesPrinted;


    }



    public void addToner (int toner) {


        if (this.tonerLevel + toner > 100) {

            System.out.println("too much passes 100%");

        }else {

            this.tonerLevel += toner;
            System.out.println("the toner is now " + this.tonerLevel + "%");

        }




    }







    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
