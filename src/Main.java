


public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(123, "Mike Jonson", 100.0);


        while (true) {
            String chois = javax.swing.JOptionPane.showInputDialog("Enter number: 1: Deposit 2: whitdraw 3: Check balance 4: Exit");

            if (chois == null) {
                javax.swing.JOptionPane.showMessageDialog(null, "GoodBye!");
                break;
            }

            double chois1 = Double.parseDouble(chois);
            if (chois1 == 1) {
                acc1.deposit();
            } else if (chois1 == 2) {
                acc1.withdraw();
            } else if (chois1 == 3) {
                javax.swing.JOptionPane.showMessageDialog(null, "$" + acc1.getBalance());
            } else if (chois1 != 1 && chois1 != 2 && chois1 != 3 && chois1 != 4) {
                javax.swing.JOptionPane.showMessageDialog(null, "Wrong chois!");
            } else if (chois1 == 4) {
                javax.swing.JOptionPane.showMessageDialog(null, "GoodBye!");
                break;
            }
        }

    }
}