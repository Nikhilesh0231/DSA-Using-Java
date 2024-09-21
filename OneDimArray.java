public class OneDimArray {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];//Default values
            myArray[0] = 5;
            myArray[1] = 1;
            myArray[2] = 8;
            myArray[3] = 2;
            myArray[4] = 10;
            myArray[2] = 9;
            // myArray[5] = 7;
            printArray(myArray);
            System.out.println(myArray.length);//Prints the length of the array
            System.out.println(myArray[myArray.length -1]);//Prints the last element of the array


            int arr[] = {2,3,4,5,6,7,8};
            printArray(arr);
            }

    public static void main(String args[]) {
        OneDimArray ODA = new OneDimArray();
        ODA.arrayDemo();
    }
}
