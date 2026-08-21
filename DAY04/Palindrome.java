import java.util.Scanner;
public class Palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome number:");
        int num = sc.nextInt();
        int rev = 0;
        int rem;
        int temp = num;
        while( num !=0){
            rem = num % 10;
            rev = rev *10 + rem;
            num = num/10;
        }
        if(rev == temp){
            System.out.println("It is palindrome.");
        }
        else{
            System.out.println("It is not  Palindrome.");
        }
        sc.close();
    }
}
