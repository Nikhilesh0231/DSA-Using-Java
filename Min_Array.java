public class Min_Array {

    public int findMinimum(int arr[]) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0];// here min will hold the minimum value of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 3, 15, 1, 2 };
        int arr1[] = { 1, 23, 42, 43, 123, 14, 21, 32, 53, 24, 121, -1, -13, -1341341, 13454 };
        Min_Array Ma = new Min_Array();
        int result = Ma.findMinimum(arr);
        System.out.println(result);
        int result1 = Ma.findMinimum(arr1);
        System.out.println(result1);
    }
}
