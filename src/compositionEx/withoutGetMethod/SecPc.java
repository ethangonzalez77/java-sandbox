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

    public void allProperties() {

        getSecMotherboard().allMotherboardProperties();

        getSecMonitor().allMonitorProperties();

        getSecCase().allCaseProperties();


//        secMotherboard.allMotherboardProperties();
//        secMonitor.allMonitorProperties();
//        secCase.allCaseProperties();

        //💚Here is a perfect ex of using private methods or direct fields to access properties of other Classes/Objects

    }


    private SecMotherboard getSecMotherboard() {
        return secMotherboard;
    }

    private SecMonitor getSecMonitor() {
        return secMonitor;
    }

    private SecCase getSecCase() {
        return secCase;
    }
}
