
public class BankAccount {

    private int cardNumber;
    private String holderName;
    private double balance;

    public BankAccount(int cardNumber, String holderName, double balance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public BankAccount() {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    ///////////////////////////// Making Account ////////////////////////////////////
    public void makeAccount() {
        while (true) {
            try {
                String cardNumberStr = javax.swing.JOptionPane.showInputDialog("Enter card number:");
                if (cardNumberStr == null) return; // user cancelled
                int cardNumber = Integer.parseInt(cardNumberStr);

                String holderName = javax.swing.JOptionPane.showInputDialog("Enter your name:");
                if (holderName == null || holderName.isEmpty()) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Name cannot be empty.");
                    continue;
                }

                String balanceStr = javax.swing.JOptionPane.showInputDialog("Enter balance:");
                if (balanceStr == null) return; // user cancelled
                double balance = Double.parseDouble(balanceStr);

                this.cardNumber = cardNumber;
                this.holderName = holderName;
                this.balance = balance;

                javax.swing.JOptionPane.showMessageDialog(null, "Account created successfully!");
                break;

            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Please enter valid numbers for card and balance.");
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////

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
