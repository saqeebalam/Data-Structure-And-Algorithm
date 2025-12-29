public class PrintNumbertillN {
    public static void main(String[] args) {
        int n=5;
        //print number till N
        //printNumber(n, 1);

        //print number N to till
        printNumberNtill(n);
    }


    public static void printNumberNtill(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printNumberNtill(n-1);

    }

    public static void printNumber(int n,int count){
        //Operation inside function
        System.out.println(count);
        
        //this is base case
        if(count==n){
            return;
        }
        //Function calling itself
        printNumber(n, count+1);
    }
}
