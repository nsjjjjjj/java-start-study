package extends1.ex2;

import extends1.ex1.ElectricCar;
import extends1.ex1.GasCar;

public class CarMain {
    public static void main(String[] args) {
        extends1.ex1.ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        extends1.ex1.GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
