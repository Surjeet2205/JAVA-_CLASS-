import java.util.Scanner;
public class Factorial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fact = 1;
        int num = sc.nextInt();
 
        for( int i =2; i<= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        sc.close(); 
    }
}
