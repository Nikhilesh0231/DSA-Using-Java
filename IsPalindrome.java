public class IsPalindrome {
    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0 ;
        int end = word.length() - 1 ;
        while (start<end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "madam";
        IsPalindrome IP = new IsPalindrome();
        if (IP.isPalindrome(word)) {
           System.out.println("The string is Palindrome!!!!!"); 
        }
        else{            
            System.out.println("The string is not Palindrome!!!!!"); 
        }
    }
}