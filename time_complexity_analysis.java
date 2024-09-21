public class time_complexity_analysis { 
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        time_complexity_analysis demo = new time_complexity_analysis();
        System.out.println(demo.findSum(99999));  
        
        System.out.println("Time Taken - " +  (System.currentTimeMillis() - now)+ " millisecs.");
    }
    // public int findSum(int n){
    //     return n*(n+1)/2;
    // }
    public int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++ ){
           sum = sum + i ;
        }
        return sum;
    }
}
