import java.util.Scanner;

public class if_else_condition {
    public static void main(String[] args) {

//   Write a Java program that takes an integer as input and uses an if-else condition to determine whether the number is even or odd.
//   Print an appropriate message accordingly.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number=");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Your number is Even number");
        }else {
            System.out.println("Your number is odd Number");
        }
    }
}
