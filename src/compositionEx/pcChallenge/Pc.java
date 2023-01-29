package compositionEx.pcChallenge;

import compositionEx.pcChallenge.Case;
import compositionEx.pcChallenge.Monitor;
import compositionEx.pcChallenge.Motherboard;

public class Pc {

    private Motherboard currentMotherboard;
    private Monitor currentMonitor;
    private Case currentCase;

    public Pc(Motherboard currentMotherboard, Monitor currentMonitor, Case currentCase) {
        this.currentMotherboard = currentMotherboard;
        this.currentMonitor = currentMonitor;
        this.currentCase = currentCase;
    }


    public Motherboard getCurrentMotherboard() {
        return currentMotherboard;
    }

    public Monitor getCurrentMonitor() {
        return currentMonitor;
    }

    public Case getCurrentCase() {
        return currentCase;
    }
}
