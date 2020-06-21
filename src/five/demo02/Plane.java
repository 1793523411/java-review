package five.demo02;

import java.util.Date;

public class Plane implements MovableObject {
    public int seatCapacity;
    public Company owner;
    public Date lastRepairDate;

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean turn(int degress) {
        return false;
    }

    @Override
    public double fuelRemaining() {
        return 0;
    }

    @Override
    public void changeSpeed(double kmPerHour) {

    }

    //plane类自己的方法：
    public Date getLastRepairDate() {
        return new Date();
    }
    public double calculateWindResistance() { return 1.2; }

}
