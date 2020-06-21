package five.demo02;

public interface MovableObject {
    public boolean start();
    public void  stop();
    public boolean turn(int degress);
    public double fuelRemaining();
    public void changeSpeed(double kmPerHour);
}
