import java.util.Scanner;
public class ResultAnalyzer{

     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name = sc.nextLine();
        System.out.println("Enter the 3 subject marks");
        System.out.println("Enter the MATHS marks:");
        int MATHS = sc.nextInt();
        System.out.println("Enter the DBMS marks:");
        int DBMS = sc.nextInt();
        System.out.println("Enter the AI marks:");
        int AI = sc.nextInt();
        int total_marks = MATHS + DBMS + AI ;
        System.out.println("TOTAL MARKS = " + total_marks);
        double Average_Marks = total_marks/3.0;
        System.out.println("Average MARKS = " + Average_Marks);
        if(MATHS >= 33 && DBMS >= 33 && AI >= 33){
            System.out.println("PASSED");
            if(Average_Marks >= 90){
                System.out.println("DISTINCTION");}
            else {
                System.out.println("DISTINCTION: NO");}
               if(Average_Marks >= 95){
                System.out.println("YOUR MARKS ARE THE HIGHEST IN THE CLASS");
                System.out.println("SO YOU DESERVE A SPECIAL REWARD");
               }
               else {
                System.out.println("Special Award: NO");
            }
            
     }  else {
           System.out.println("Result: FAILED");
            System.out.println("Distinction: NO");
            System.out.println("Special Award: NO");
        }
        sc.close();
    }
}       
