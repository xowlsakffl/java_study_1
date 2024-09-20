package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn = 123;
        String carName = "아반떼";
        int carPrice = 3000;
        String carOwner = "안민성";
        int carYear = 2018;
        String carType = "d";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        //carPrint(car);
        CarUtility cu = new CarUtility();
        cu.carPrint(car);
    }
}
