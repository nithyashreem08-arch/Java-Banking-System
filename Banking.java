class Account {
    String name;
    String account_type;
    int acc_number;
    double balance;

    Account(String a, String b, int c, double d) {
        name = a;
        account_type = b;
        acc_number = c;
        balance = d;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Account Type = " + account_type);
        System.out.println("Account Number = " + acc_number);
        System.out.println("Account Balance = " + balance);
    }
}

public class Banking {
    public static void main(String[] args) {

        Account acc1 = new Account("Raj", "Saving", 12345, 10000);

        acc1.deposit(10000);
        acc1.withdraw(5000);
        acc1.display();

        Account acc2 = new Account("Niraj", "Saving", 1900, 25000);

        acc2.deposit(30000);
        acc2.withdraw(15000);
        acc2.display();
    }
}





