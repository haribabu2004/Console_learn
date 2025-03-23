package Abstaction;
// import java.util.*;

abstract class  Car {
    abstract void start();
}

public class Verna extends Car {
    void start(){
        System.out.println("NEw desgin looks good");
    }
}

class Abt1{
    public static void main(String[] args) {
        Car newCar = new Verna();
        System.out.println();
        newCar.start();
    }
}