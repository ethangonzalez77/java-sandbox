package compositionEx.withoutGetMethod;

public class SecPcEx {

    public static void main(String[] args) {

        SecMotherboard sm1 = new SecMotherboard("m1", "Asus Company", 4, 4, "v2.0");

        SecResolution sr1 = new SecResolution(1080, 720);
        SecMonitor smo1 = new SecMonitor("Fancy Monitor", "Asus Company", 34, sr1);

        SecDimensions sd1 = new SecDimensions(21, 17, 5);
        SecCase sc1 = new SecCase("Fancy Case", "Asus Company", "20v", sd1);

        SecPc pc1 = new SecPc(sm1, smo1, sc1);


        pc1.PowerOn();

//        pc1.getSecCase().allProperties();  old way

        pc1.allProperties();






    }
}
