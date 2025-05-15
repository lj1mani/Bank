

public class BankAccount {

    private int cardNumber;
    private String holderName;
    private double balance;

    public BankAccount(int cardNumber, String holderName, double balance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit() {

        String amount = javax.swing.JOptionPane.showInputDialog("Enter amount of money to deposit");
        //double amount1 = Double.parseDouble(amount);
        if (amount == null) {
            return;
        }
        try {
            double amount1 = Double.parseDouble(amount);
            if (amount1 > 0) {
                balance += amount1;
                javax.swing.JOptionPane.showMessageDialog(null, "Deposited $" + amount1);
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Invalid amount!");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        }
    }

    public void withdraw() {
        String amount = javax.swing.JOptionPane.showInputDialog("Enter amount of money to withdraw");
        //double amount1 = Double.parseDouble(amount);

        if (amount == null) {
            return;
        }

        try {
            double amount1 = Double.parseDouble(amount);
            if (amount1 > 0 && amount1 <= balance) {
                balance -= amount1;
                javax.swing.JOptionPane.showMessageDialog(null, "Withdrawn $" + amount1);
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Invalid or insufficient amount!");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        }
    }

}
