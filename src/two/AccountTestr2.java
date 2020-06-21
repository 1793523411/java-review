package two;

public class AccountTestr2 {
    public static void main(String args[]) {
        BankAccount2 bobsAccount, marysAccount, biffsAccount;
        bobsAccount = BankAccount2.example1();
        marysAccount = BankAccount2.example1();
        biffsAccount = BankAccount2.example2();
        marysAccount.setOwnerName("Mary");
        marysAccount.deposit(250);
        System.out.println(bobsAccount);
        System.out.println(marysAccount);
        System.out.println(biffsAccount);
//        System.out.println("heloow");
    }
}

