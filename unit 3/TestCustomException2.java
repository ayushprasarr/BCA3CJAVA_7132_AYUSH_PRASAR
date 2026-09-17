class InsBalEception extends Exception {
    public InsBalEception(String message) {
        super(message);
    }
}

public class TestCustomException2 {

    static void withdraw(double balance, double amount)
            throws InsBalEception {

        if (amount > balance) {
            throw new InsBalEception(
                "Insufficient Balance! Available Balance: " + balance
            );
        } else {
            double remainingBalance = balance - amount;

            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + remainingBalance);
        }
    }

    public static void main(String[] args) {
        try {
            double balance = 600.0;
            double amount = 500.0;

            System.out.println("Processing Withdrawal for Vivaan>>>");
            withdraw(balance, amount);

        } catch (InsBalEception e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
