public class Fibonaci {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <=n; i++) {
        System.out.print(fib(i) + " ");
    }
    }

    public static int fib(int n) {
        
        if(n<=1){
            return n;
        }
        int first=fib(n-1);
        int sLast=fib(n-2);
        
        return first+sLast;
    }
}
