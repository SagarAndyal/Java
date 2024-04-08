import java.util.Scanner;

public class if_else_condition_ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//      Create a Java program that prompts the user to enter three numbers.
//      Use if-else conditions to find and print the largest among the three numbers.

        System.out.println("Enter number 1= ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2= ");
        int num2=sc.nextInt();
        System.out.println("Enter number 3= ");
        int num3=sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Number 1 is grater than number 2 and number 3");
        } else if (num2>num1 && num2>num3) {
            System.out.println("Number 2 is grater than number 1 and number 3");
        }else if(num3>num1 && num3>num2) {
            System.out.println("Number 3 is grater than number 1 and number 2");
        }else {
            System.out.println("Your number is wrong number...");
        }

    }
}
