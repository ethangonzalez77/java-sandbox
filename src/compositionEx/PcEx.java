package compositionEx;

public class PcEx {

    public static void main(String[] args) {

        Motherboard m1 = new Motherboard("Asus1", "Asus Company", 4, 2, "v1.0");

        Resolution r1 = new Resolution(1080, 720);
        Monitor mon1 = new Monitor("4k tv", "Asus Company", 32, r1);

        Dimensions d1 = new Dimensions(21, 18, 5);
        Case c1 = new Case("blue case", "Asus Company", "20 volts", d1);

        Pc pC1 = new Pc(m1, mon1, c1);//only accepts objects from that specific datatype (ie. Motherboard, Monitor, Case), Not a String, Not in int, Not a Resolution datatype or any other, because of hte way we set out constructor up.


        pC1.getCurrentCase().powerButton();
        pC1.getCurrentMonitor().drawImage(12, 17, "green");
        pC1.getCurrentMotherboard().loadProgram("THE BEST");












    }
}
