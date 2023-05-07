import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


class Account {
    public int activity;

     public void details() {
         System.out.println("Welcome to Marvel Bank, where you can make transaction easily");
         bankActivities();
     }

     public void bankActivities() {
        System.out.println("Please select 1 to open an account \n 2 to make transaction \n  3 to quit.");  
        Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();        
        if(choice == 1) {
            createAccount();
        } else if(choice == 2) {
             transaction();
        }else if(choice == 3) {
             System.out.println("This is Marvel Bank \n Thanks for your patronage \n The application has exited.");
		     System.exit(0);
        }else {
             System.out.println("Please select a valid option");
             bankActivities();
        }
     }

     public void createAccount() {
         Scanner scan = new Scanner(System.in);
         System.out.println("FullName: ");
          String fullName = scan.nextLine();
          System.out.println("FullName: " + fullName);

          System.out.println("Country: ");
          String country = scan.nextLine();

          System.out.println("State: ");
          String state = scan.nextLine();

          System.out.println(fullName + country + state);
          
        //   System.out.println("You've Successfully created an account with Marvel Bank, Do you want to perform any other activity? \n Press 1 Yes \n 2 No");
          
          int activity = scan.nextInt();
          if(activity == 1) {
            bankActivities();
          }else {
            System.out.println("This is Marvel Bank \n Thanks for your patronage \n The application has exited.");
		     System.exit(0);
          }
     }

     public void transaction() {
        Scanner scan = new Scanner(System.in);
         System.out.println("Press \n  1 Transfer \n 2 Deposit \n 3 Back");
               int transactionNo = scan.nextInt();
               if(transactionNo == 1) {
                System.out.println("Beneficiary Acc No:");
                int bfAccNo = scan.nextInt();
                System.out.println("Beneficiary Acc Name:");
                String bfName = scan.nextLine();
                System.out.println("Amount:");
                int amount = scan.nextInt();
                System.out.println("Transaction Successful, Do you want to perform any other activity? \n Press 1 Yes \n 2 No");
                int activity = scan.nextInt();
                if(activity == 1) {
                    bankActivities();
                }else {
                    System.out.println("This is Marvel Bank \n Thanks for your patronage \n The application has exited.");
                    System.exit(0);
                }
            }  else if(transactionNo == 2) {
                System.out.println("Amount:");
                int withdrawAmount = scan.nextInt();
                System.out.println("Transaction Successful");
            }   else {
                bankActivities();
             }
     }
}





public class ATM {
    public static void main(String[] args) {
       Account ac = new Account();
       ac.details();
    }
}