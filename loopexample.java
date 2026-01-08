import java.util.Scanner;

public class loopexample{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name:");
        String name = sc.nextLine();

        System.out.print("enter your age:");
        int age = sc.nextInt();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        sc.close();


    }
}