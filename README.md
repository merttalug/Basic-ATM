# Basic ATM
 A basic ATM project where users can manage their bank account

## Transactions

This ATM program has 4 basic functions :

1. Deposit Money
2. Withdraw Money
3. Balance Inquiry
4. Logout

### Information

This ATM works by referencing the username as "patika" and the password as "dev123". If users enter one of the username or password incorrectly 3 times, they will block their accounts and terminate the program. The initial balance information of the users is set at $2800.




```
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
```
