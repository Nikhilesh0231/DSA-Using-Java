public class FindMissingNumber {
    public int findMissingNumber(int arr[]){
        int n = arr.length + 1 ;
        int sum = n * ( n + 1 ) / 2 ;
        for (int num : arr) {
            sum = sum - num ;
        }
        return sum ;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 6 , 9 , 7 , 8};
        FindMissingNumber fmn = new FindMissingNumber();
        System.out.println(fmn.findMissingNumber(arr));
    }
}
