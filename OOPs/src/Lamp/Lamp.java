package Lamp;

public class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Lamp is on");
    }

    void turnOff(){
        isOn = false;
        System.out.println("Lamp is off");
    }

}
