import java.util.ArrayList;

public class BankApp {

    private ArrayList<BankAccount> accounts;

    public BankApp() {
        accounts = new ArrayList<>();
    }

    public void addNewAccount() {
        BankAccount newAcc = new BankAccount();
        newAcc.makeAccount();
        if (newAcc.getHolderName() != null) {
            accounts.add(newAcc);
        }
    }

    public void addNewAccount2(BankAccount acc) {
        accounts.add(acc);
        javax.swing.JOptionPane.showMessageDialog(null, "Account added successfully!");
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "No accounts found.");
            return;
        }

        StringBuilder sb = new StringBuilder("List of Accounts:\n");
        for (BankAccount acc : accounts) {
            sb.append("Card: ").append(acc.getCardNumber())
                    .append(" | Name: ").append(acc.getHolderName())
                    .append(" | Balance: $").append(String.format("%.2f", acc.getBalance()))
                    .append("\n");
        }

        javax.swing.JOptionPane.showMessageDialog(null, sb.toString());
    }


}
