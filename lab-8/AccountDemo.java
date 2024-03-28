class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (balance < amount) {
            throw new InsufficientFundException("Insufficient funds to complete the withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static class InsufficientFundException extends Exception {
        public InsufficientFundException(String message) {
            super(message);
        }
    }
}




public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account(1000);

        try {
            account.deposit(1500);
            System.out.println("Current balance: " + account.getBalance());

            account.withdraw(1500);
            System.out.println("Current balance: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Account.InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}