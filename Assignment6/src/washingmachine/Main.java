package washingmachine;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();

        washingMachine.switchOn();
        int clothes = washingMachine.acceptClothes(10);
        System.out.println("Number of clothes: " + clothes);
        washingMachine.acceptDetergent();
        washingMachine.switchOff();
    }
}
