import java.util.*;

class revision {
    // public static void main(String args[]) {
    // // int num1 = 10;
    // // int num2 = 20;
    // // int subtract = num1 - num2;
    // // int sum = num1 + num2;
    // // System.out.println(sum);
    // // System.out.println(subtract);

    // // reading data from the keyword
    // Scanner sc = new Scanner(System.in);
    // // System.out.println("Enter First Number");
    // // int num1 = sc.nextInt();
    // // System.out.println("Enter Second Number");
    // // int num2 = sc.nextInt();
    // // int multiply, division;
    // // multiply = num1 * num2;
    // // division = num1 / num2;
    // // System.out.println("The Multiplication is " + multiply + "The Division is
    // " +
    // // division);

    // // Printing star pyramid
    // System.out.println("Enter the height of the pyramid");
    // int height = sc.nextInt();
    // // for (int i = 0; i <= height-1; i++) {
    // // for (int j = 0; j <= i; j++) {
    // // System.out.print("*");
    // // }
    // // System.out.println();
    // // }
    // int i = 1;
    // while(i<= height){
    // for(int j = 1 ; j <= i ; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // i++;
    // }
    // }
    public static void main(String srgs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows:");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = row - i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
