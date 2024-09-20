package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 일련번호 : ");
        int carSn = sc.nextInt();

        sc.nextLine();

        System.out.println("자동차 이름 : ");
        String carName = sc.nextLine();

        System.out.println("자동차 가격 : ");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.println("자동차 소유자 : ");
        String carOwner = sc.nextLine();

        System.out.println("자동차 연식 : ");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.println("자동차 타입 : ");
        String carType = sc.nextLine();

        //System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);

        //자동차 데이터를 이동하기 위한 바구니
        //클래스로 CarDTO, CarVo 모델을 설계
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        carInfoPrint(car);
    }

    //매개변수로 자동차 객체를 받아서 출력
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}