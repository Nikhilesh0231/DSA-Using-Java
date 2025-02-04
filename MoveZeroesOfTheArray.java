public class MoveZeroesOfTheArray {
    
    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void moveZeros(int arr[],int n){
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if (arr[i] != 0  &&  arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }  
    public static void main(String[] args) {
        int arr[] = {0,1,0,4,12};
        printArray(arr);
        moveZeros(arr, arr.length);
        printArray(arr);

    }
}