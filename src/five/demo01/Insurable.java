package five.demo01;

import java.util.Date;

public interface Insurable {
    public int getNumber();
    public int getCoverageAmount();
    public double calculatePremium();
    public Date getExpiryDate();

}
