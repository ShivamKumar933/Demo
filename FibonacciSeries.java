public class FibonacciSeries {
    public static void printFibonacci(int n){
        int a = 0, b = 1;
        System.out.print(a + " "+ b +" ");

        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c +" ");
        }
    }
    public static void main(String[] args) {
        int n = 10;

        printFibonacci(n);
    }
}
