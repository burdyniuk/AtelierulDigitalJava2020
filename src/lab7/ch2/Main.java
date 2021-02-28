package lab7.ch2;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("ba1", 2000);
        BankAccount b2 = new BankAccount("ba2", 4000);
        BankAccount b3 = new BankAccount("ba3", 2500);

        TransactionThread tt1 = new TransactionThread("trans1", b1, b2, 2000);
        TransactionThread tt2 = new TransactionThread("trans2", b1, b3, 1900);
        tt1.start();
        tt2.start();
    }
}
