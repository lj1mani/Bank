


public class Main {
    public static void main(String[] args) {
        ///// Testing Code /////////////////////////////
        BankAccount acc1 = new BankAccount();

        BankApp app = new BankApp();


        acc1.makeAccount();

        app.addNewAccount2(acc1);

        while (true) {
            String chois = javax.swing.JOptionPane.showInputDialog("Enter number: \n1: Deposit \n2: Whitdraw \n3: Check balance \n4: Exit \n5: Info");

            if (chois == null) {
                javax.swing.JOptionPane.showMessageDialog(null, "GoodBye!");
                break;
            }

            int chois1;

            try {
                chois1 = Integer.parseInt(chois);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid number (1–5).");
                continue;
            }

            if (chois1 == 1) {
                acc1.deposit();
            } else if (chois1 == 2) {
                acc1.withdraw();
            } else if (chois1 == 3) {
                javax.swing.JOptionPane.showMessageDialog(null, "$" + acc1.getBalance());
            } else if (chois1 == 4) {
                javax.swing.JOptionPane.showMessageDialog(null, "GoodBye!");
                break;
            } else if (chois1 == 5) {
                app.listAccounts();
            } else if (chois1 != 1 && chois1 != 2 && chois1 != 3 && chois1 != 4 && chois1 != 5) {
                javax.swing.JOptionPane.showMessageDialog(null, "Wrong chois!");
            }
        }

    }
}