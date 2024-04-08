import java.util.Scanner;

public class if_else_condition_ex3 {
    public static void main(String[] args) {
//        Develop a Java program that checks if a given year is a leap year or not.
//        Use an if-else condition to perform the leap year check and print the result.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check given year is Leap year or not = ");
        int year=sc.nextInt();

        if (year%4==0){
            System.out.println(+year+" This year is Leap year...");
        }else {
            System.out.println(+year+" This year is Not Leap year...");
        }
    }
}
