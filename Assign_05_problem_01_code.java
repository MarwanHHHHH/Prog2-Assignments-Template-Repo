//Marwan Waleed Mamdouh
//20216258
public class BankAccount {
    private double balance;
    private String username;
    private String bankname;
    private static final String country = "Egypt";
    private static int NumOfUsers = 0;
    private static int NumOfcalls = 0;

    public BankAccount() {
        this.balance = 0;
        this.username = "";
        this.bankname = "";
        System.out.println("Your Bank Account has been created.");
        NumOfUsers++;
    }

    public BankAccount(double initialBalance, String username, String bankname) {
        this.balance = initialBalance;
        this.username = username;
        this.bankname = bankname;
        System.out.println("Your Bank Account has been created.");
        NumOfUsers++;
    }

    public void Deposite(double amount) {
        balance += amount;
        NumOfcalls++;
    }

    public void Withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            NumOfcalls++;
        } else {
            System.out.println("No remaining balance");
        }
    }

    public static int getNumOfUsers() {
        return NumOfUsers;
    }

    public static int getNumOfCalls() {
        return NumOfcalls;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }
}

//MainFile

public class main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println("Balance of account1 is: " + account1.getBalance());
        System.out.println("Number of users: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls for Deposite() function: " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls for Withdraw() function: " + BankAccount.getNumOfCalls());

        BankAccount account2 = new BankAccount(23000, "Marwan Waleed", "CIB bank");
        account2.Deposite(500);
        account2.Withdraw(200);
        System.out.println("Balance of account2 is: " + account2.getBalance());
        System.out.println("Number of users: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls for Deposite() function: " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls for Withdraw() function: " + BankAccount.getNumOfCalls());
    }
}