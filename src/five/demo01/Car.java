package five.demo01;

import java.util.Date;

public class Car implements Insurable {
    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getCoverageAmount() {
        return 0;
    }

    @Override
    public double calculatePremium() {
        return 0;
    }

    @Override
    public Date getExpiryDate() {
        return null;
    }
    public void getMileage() {  //新添加的方法
        //write code here
    }
}
