package two;

public class BankAccount2 {
    private static int LAST_ACCOUNT_NUMBER = 0;
    private int accountNumber;
    private String ownerName;
    private float balance;
    public BankAccount2() {  this("", 0);  }
    public BankAccount2(String initName) { this(initName, 0); }
    public BankAccount2(String initName, float initBal) {
        ownerName = initName;
        accountNumber = ++LAST_ACCOUNT_NUMBER;
        balance = initBal;
    }
    public static BankAccount2 example1() {
        BankAccount2 ba = new BankAccount2();
        ba.setOwnerName("LiHong");
        ba.deposit(1000);
        return ba;
    }
    public static BankAccount2 example2() {
        BankAccount2 ba = new BankAccount2();
        ba.setOwnerName("ZhaoWei");
        ba.deposit(1000);
        ba.deposit(2000);
        return ba;
    }
    public static BankAccount2 emptyAccountExample() {
        BankAccount2 ba = new BankAccount2();
        ba.setOwnerName("HeLi");
        return ba;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public float getBalance() {
        return balance;
    }
    public void setOwnerName(String aName) {
        ownerName = aName;
    }
    public String toString() {
        return("Account #"+
                new java.text.DecimalFormat("000000").format(accountNumber) +
                " with balance " +
                new java.text.DecimalFormat("$0.00").format(balance));
    }
    public float deposit(float anAmount) {
        balance += anAmount;
        return balance;
    }
    public float withdraw(float anAmount) {
        if (anAmount <= balance)
            balance -= anAmount;
        return anAmount;
    }
}


