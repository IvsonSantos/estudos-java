package java7.thread.exemplo2;

public class Worker implements Runnable {

    private BankAccount bankAccount;

    public Worker(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int startBalance = bankAccount.getBalance();
            bankAccount.deposit(10);
            int endBalance = bankAccount.getBalance();

            System.out.println("Star:t " + startBalance + ", End: " + endBalance);
        }
    }

}
