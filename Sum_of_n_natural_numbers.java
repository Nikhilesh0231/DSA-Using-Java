import java.util.Scanner;
public class Sum_of_n_natural_numbers {
    public static void main(String Args[]){
         System.out.println("Enter a number : ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum = 0;
         for(int i = 1; i <= n; i++ ){
            sum = sum + i ;
         }
         System.out.println(sum);
    }
}
