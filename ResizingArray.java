public class ResizingArray {
    public int[] resizeArray(int arr[], int capacity){
        int temp [] = new int[capacity];
        for( int i = 0 ; i < arr.length ; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public static void main(String[] args) {
        ResizingArray R1 = new ResizingArray();
        int arr[] = { 5 , 9 , 3 , 10};
        System.out.println("The size of te arr - " + arr.length);
        arr = R1.resizeArray(arr, 12);
        System.out.println("The size of te arr - " + arr.length);
    }
}
 