import java.util.Scanner;
public class Bank{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name: ");
        String name = sc.nextLine();
        System.out.println("Enter the Student id: ");
        int id = sc.nextInt();
        System.out.println("Enter the Account Number: ");
        int acc = sc.nextInt();
        System.out.println("Enter the initial deposit (must be > 0) : ");
        double balance = sc.nextDouble();
        if(balance > 0){
            System.out.println("Account Created Successfully.");
        }
        else{
            System.out.println("Invalid Amount.");
            return;
        }

        
        System.out.println("1. Deposit Money ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Check Balance ");
        System.out.println("4. Display Account Details ");
        System.out.println("5. Calculate Interest ");
        System.out.println("6. Exit ");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();
    
        switch(choice){
            case 1:{
                System.out.println("Enter the deposit amount: ");
                double deposit = sc.nextDouble();
                if(deposit <= 0){
                    System.out.println("Deposit Failed. Amount cannot be negative or zero.");
                }
                else{
                    balance = (balance + deposit);
                    System.out.println(deposit + " deposited successfully.");
                    System.out.println("Current Balance: " + balance);
                }
                break;
            }
            case 2:{
                System.out.println("Enter Withdrawl Amount: ");
                double withdrawl = sc.nextDouble();
                if(withdrawl <= 0){
                    System.out.println("Withdrawl amount cannot be zero or less than zero.");
                }
                else if(withdrawl > balance){
                    System.out.println("Insufficient Balance.");
                }
                else{
                    balance = (balance - withdrawl);
                    System.out.println("Withdrawl successful. ");
                    System.out.println("Current Balance: " + balance);
                }
                break;
            }
            case 3:{
                System.out.println("Current Balance: " + balance);
                break;
            }
            case 4:{
                System.out.println("Student Name: " + name);
                System.out.println("Student ID: " + id);
                System.out.println("Account No: " + acc);
                System.out.println("Balance: " + balance);
                break;
            }
            case 5:{ 
                System.out.println("Enter the number of years: ");
                int time = sc.nextInt();
                int rate = 5;
                double interest;
                interest = (balance * rate * time)/100;
                System.out.println("Interest earned: " + interest);
                balance = (balance + interest);
                System.out.println("New balance: " + balance);
                break;
            }
            case 6:{
                System.out.println("Thank you for using student bank system.");
                break;
            }
            default:{
                System.out.println(" ");
            }
        }
        sc.close();
    }
}
