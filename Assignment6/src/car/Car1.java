package car;

public class Car1 {
    public static void main(String[] args) {
        Car marutiCar = new Maruti("Swift");
        Car santroCar = new Santro("Xing");

        marutiCar.displayModel();
        marutiCar.avg();
        marutiCar.mode();

        System.out.println();

        santroCar.displayModel();
        santroCar.avg();
        santroCar.mode();
    }
}
