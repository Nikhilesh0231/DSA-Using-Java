class Average {
    public static void findAverage(int a , int b, int c){
        int sum = a +b + c;
        int avg = sum /3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
       findAverage(3,6,9);
    }
}