package Bicycle;

public class BicycleClient {
    public static void main(String[] args) {
        Bicycle SportsBicycle = new Bicycle();

        System.out.println(SportsBicycle.gear);
        SportsBicycle.breaking();
    }
}
