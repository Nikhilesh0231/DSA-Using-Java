public class Reverse_array {
    //Method for printing array
    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int numbers_arr[] , int start , int end){
        while (start < end) {
            int temp = numbers_arr[start];
            numbers_arr[start] = numbers_arr[end];
            numbers_arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
      int numbers[] = { 2 , 11 , 10 , 5 , 7 , 8 };
      printArray(numbers);
      reverseArray(numbers, 0, numbers.length-1);
      printArray(numbers);
    }
}
