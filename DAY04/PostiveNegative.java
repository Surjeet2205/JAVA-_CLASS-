import java.util.Scanner;
public class PostiveNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positvie Number");
        }
        else if(num < 0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("It's Zero");
        }
        sc.close();
    }
}
