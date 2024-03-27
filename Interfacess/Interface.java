import java.io.*;

interface Vehicle
{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class Bicycle implements Vehicle
{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear)
    {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment)
    {
        speed = speed + increment;
    }

    @Override
    public void applyBrake(int decrement)
    {
        speed = speed - decrement;
    }

    public void printState()
    {
        System.out.println("Speed:"+ speed + " Gear:"+ gear);
    }
}

class Bike implements Vehicle
{
    int speed;
    int gear ;

    @Override
    public void changeGear(int newGear)
    {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment)
    {
        speed = speed + increment;
    }

    @Override
    public void applyBrake(int decrement)
    {
        speed = speed - decrement;
    }

    public void printState()
    {
        System.out.println("Speed:"+speed + " Gear:"+gear);
    }
}

public class Main{
    public static void main(String[] args)
    {
        Bicycle bicycle  = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(4);
        bicycle.applyBrake(1);

        System.out.println("Bicycle present state:");
        bicycle.printState();

        Bike bike  = new Bike();
        bike.changeGear(3);
        bike.speedUp(5);
        bike.applyBrake(2);

        System.out.println("Bike present state:");
        bike.printState();
    }
}

