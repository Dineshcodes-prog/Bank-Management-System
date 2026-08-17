
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Bank Name: ");
        String bankName = scanner.nextLine();
        System.out.println("Enter the User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the User Name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter the Account Number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the Account Type: ");
        String accountType = scanner.nextLine();
        System.out.println("Enter the Balance: ");
        double balance = scanner.nextDouble();

        Bank ob = new Bank(bankName, userId, userName, accountNumber, accountType, balance);
        ob.displayBankDetails();
        ob.displayUserDetails();
        ob.displayAccountDetails();

        String accountSummary = ob.createAccountSummary();
        System.out.println("");
        System.out.println("Account Summary : \n" + accountSummary);
        System.out.println("");
        System.out.println("Enter the Minimum Balance: ");
        double minimumBalance = scanner.nextDouble();
        boolean miniBalance = ob.hasMinimumBalance(minimumBalance);
        if (miniBalance) {
            System.out.println("Minimum balancce is  maintained");
        } else {
            System.out.println("Minimum balance is not maintained");
        }

        scanner.close();

    }
}
