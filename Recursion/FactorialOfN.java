public class FactorialOfN {
    public static void main(String[] args) {
        int n=3;
        System.out.println(factorialOfN(n));
    }

    public static int factorialOfN(int n){
        if(n==1){
            return 1;
        }
        int i=factorialOfN(n-1);
        return i*n;
    }
}
