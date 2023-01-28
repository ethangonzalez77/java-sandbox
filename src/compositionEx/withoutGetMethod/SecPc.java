package compositionEx.withoutGetMethod;

public class SecPc {

    private SecMotherboard secMotherboard;

    private SecMonitor secMonitor;

    private SecCase secCase;


    public SecPc(SecMotherboard secMotherboard, SecMonitor secMonitor, SecCase secCase) {
        this.secMotherboard = secMotherboard;
        this.secMonitor = secMonitor;
        this.secCase = secCase;
    }


    public void PowerOn () {

        secCase.pressPowerButton();
        secMonitor.drawImage(22, 44, "Magenta");
        secMotherboard.loadProgram("The Best!!!");
    }




//    public SecMotherboard getSecMotherboard() {
//        return secMotherboard;
//    }
//
//    public SecMonitor getSecMonitor() {
//        return secMonitor;
//    }
//
//    public SecCase getSecCase() {
//        return secCase;
//    }
}
