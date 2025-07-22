package com.cams;

public class Main {

    public static void main(String[] args) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$ Welcome to CAMS Bank $$$$$$$$$$$$$$$$$$$$$$$$");

        while (true) {
            System.out.println("1) Login\n2) Register\n3) Exit");
            int choice = UserInput.getInt("Enter your choice[1-3]: ");

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            String username = UserInput.getString("Enter username: ");
            String password = UserInput.getString("Enter password: ");
            // You can add real authentication logic here.
            System.out.println("Login Successful!\n");

            DerivedClasses bank = new DerivedClasses();

            while (true) {
                System.out.println("\n1) View Accounts\n2) Add Account\n3) Edit Account\n4) Deposit\n5) Withdraw\n6) Logout");
                int dashChoice = UserInput.getInt("Enter choice: ");

                switch (dashChoice) {
                    case 1:
                        bank.viewAccounts();
                        break;
                    case 2:
                        bank.addAccount();
                        break;
                    case 3:
                        bank.editAccount();
                        break;
                    case 4:
                        bank.deposit();
                        break;
                    case 5:
                        bank.withdraw();
                        break;
                    case 6:
                        bank.logout();
                        break;
                    default:
                        System.out.println("Invalid option.");
                }

                if (dashChoice == 6) break;
            }
        }
    }
}
