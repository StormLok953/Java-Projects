package Homework.hw1;

public class Car {

    Vehicle Car = new Vehicle();

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }

    public int moving;

    public void handSteering() {
        System.out.println("steering called");
    }

    public void changeGears() {
        System.out.println("changing gears");
    }


}
