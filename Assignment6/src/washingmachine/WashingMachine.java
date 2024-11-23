package washingmachine;

public class WashingMachine {

    public void switchOn() {
        System.out.println("Washing machine is now ON.");
    }

    public int acceptClothes(int noOfClothes) {
        System.out.println("Accepted " + noOfClothes + " clothes.");
        return noOfClothes;
    }

    public void acceptDetergent() {
        System.out.println("Detergent accepted.");
    }

    public void switchOff() {
        System.out.println("Washing machine is now OFF.");
    }
}

