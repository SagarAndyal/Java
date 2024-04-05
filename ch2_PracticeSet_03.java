import java.util.Scanner;

public class ch2_PracticeSet_03 {
    public static void main(String[] args) {

        int a= (int) (Math.random()*100);
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number=");
        int usernumber=sc.nextInt();

        if (usernumber>a){
            System.out.println("The number is grater..");
        }else {
            System.out.println("The number is small..");
        }
        System.out.println("the number was="+a);
    }
}
