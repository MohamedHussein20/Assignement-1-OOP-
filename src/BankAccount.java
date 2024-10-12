public class BankAccount {
    private String account_id;
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Your balance is not enough to withdraw this amount");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public boolean deposit(int amount) {
        if (amount < 0) {
            System.out.println("invalid number");
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000);
        account.setAccount_id("42022005");
        System.out.println("Account ID: " + account.getAccount_id());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(100);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}

