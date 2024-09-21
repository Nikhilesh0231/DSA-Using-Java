import java.util.Scanner;
public class StarPyramid {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid : ");
        int height = sc.nextInt();
    //Triangle
    // for(int i = 1 ; i <= height ; i++){
    //     for(int j = 1 ; j <=i; j++){

    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //triangle II
    //     for(int i = 1 ; i <= height ; i++){
    //         for(int k = i ; k <=height ; k++){
    //             System.out.print(" ");
    //         }
    //     for(int j = 1 ; j <=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    for (int i = 1; i <= height; i++) {
        // Print spaces
        for (int j = i; j < height; j++) {
            System.out.print(" ");
        }
        // Print stars
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
