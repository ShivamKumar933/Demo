public class CheckPositveOrNegative {
    public static void checkNumber(int n){
        if(n == 0){
            System.out.println("The number is zero");
        }
        else if(n < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is positive");
        }
    }
    public static void main(String[] args) {
        int n = 45;
        checkNumber(n);
    }
}
