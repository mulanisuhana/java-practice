import java.util.Scanner;
     public class calculator{
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);

             System.out.print("enter first number:");
             double a = sc.nextDouble();

             System.out.print("enter second number:");
             double b = sc.nextDouble();

             System.out.println("Add:" +(a+b));
             System.out.println("sub:" +(a-b));
             System.out.println("multiply:" +(a*b));
             System.out.println("div:" +(a/b));

             sc.close();

        }
     }