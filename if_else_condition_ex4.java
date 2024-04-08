import java.util.Scanner;

public class if_else_condition_ex4 {
    public static void main(String[] args) {
//  Write a Java program that takes a student's exam score as input and assigns a grade based on the following criteria:
//      90-100: A
//      80-89: B
//      70-79: C
//      60-69: D
//      Below 60: F
//      Print the grade for the given score.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your score= ");
        int score=sc.nextInt();
        if (score>=90 && score<=100){
            System.out.println("YOUR GRADE IS = A ");
        } else if (score>=80 && score<89) {
            System.out.println("YOUR GARDE IS = B");
        } else if (score>=70 && score<79) {
            System.out.println("YOUR GARDE IS = C");
        }else if (score>=60 && score<69) {
            System.out.println("YOUR GARDE IS = D");
        }else {
            System.out.println("YOUR GRADE IS = F");
        }
    }
}
