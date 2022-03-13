import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2800;
        int select;
        while (right > 0) {
            System.out.println("Your Username: ");
            userName = input.nextLine();
            System.out.println("Your Password: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to the Patika Bank...");
                do {
                    System.out.println("1- Deposit Money\n" + "2- Withdraw Money\n" + "3- Balance Inquiry\n" + "4- Logout");
                    System.out.print("Please select the banking transaction you want to do : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Enter the amount of money you want to deposit: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.println("Enter the amount of money you want to withdraw: ");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Your balance is insufficient.");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Your Balance is: " + balance);
                            break;
                    }
                }
                while (select != 4);
                    System.out.println("See you again...");
                break;
            } else {
                right--;
                System.out.println("Invalid password or username ! Please try again...");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining login right: " + right);
                }
            }

        }
    }
}
