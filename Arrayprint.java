public class Arrayprint {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void reversePrint(int []arr){
        int n = arr.length-1;
        for(int i = n ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Arrayprint a1 = new Arrayprint();
        a1.printArray(arr);
        a1.reversePrint(arr);
    }
}
