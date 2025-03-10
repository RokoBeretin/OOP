package uml;

public class Yacht extends Boat implements Turbo{
    @Override
    public void run() {
        System.out.println("Specific way of flowing on the sea in the Yacht");
    }

    @Override
    public void goToTurboMode() {
        System.out.println("Sailing in the turbo mode...");
    }
}
