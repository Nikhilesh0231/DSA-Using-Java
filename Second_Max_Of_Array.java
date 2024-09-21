public class Second_Max_Of_Array {

    public int findSecondMax(int arr[]){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
  
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        for( int i = 0 ; i < arr.length ; i++){
            if (arr[i]>max) {
                SecondMax = max;
                max = arr[i];
            }
            else if (arr[i] > SecondMax && arr[i] != max) {
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 12 , 34 , 2 , 34 , 33 , 1};
        Second_Max_Of_Array s1 = new Second_Max_Of_Array();
        int result = s1.findSecondMax(arr);
        System.out.println(result);
    }
}
