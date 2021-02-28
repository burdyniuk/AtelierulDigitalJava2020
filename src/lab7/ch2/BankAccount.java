package lab7.ch2;

public class BankAccount {

    private String name;
    private double debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if(amount <= debit) {
            this.debit -= amount;
            System.out.println("dupa scoatere cash: " + this.debit);
        }
        else throw new InsufficientFundsException();

    }

    public void deposit(double amount) {
        longDatabaseCall();
        this.debit += amount;
        System.out.println("dupa depunere: " + this.debit);
    }
    private void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
