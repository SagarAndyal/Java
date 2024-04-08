import java.util.Scanner;

public class if_else_condition_ex5 {
    public static void main(String[] args) {

//        Implement a Java program that takes three integer inputs representing the sides of a triangle.
//        Use if-else conditions to determine and print whether the triangle is equilateral, isosceles, or scalene.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side1= ");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of side2= ");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of side3= ");
        int side3 = sc.nextInt();

        String triangleType;

        switch (checkTringleType(side1, side2, side3)) {
            case 1:
                triangleType = "Equilateral";
                break;
            case 2:
                triangleType = "Isosceles";
                break;
            case 3:
                triangleType = "Scalene";
                break;
            default:
                triangleType = "Invalid";
                break;
        }

        System.out.println("Triangle Type= " + triangleType);
    }
    private static int checkTringleType(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            return 1;
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return 2;
        } else if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side1) {
            return 3;
        } else {
            return 0;
        }
    }
}
