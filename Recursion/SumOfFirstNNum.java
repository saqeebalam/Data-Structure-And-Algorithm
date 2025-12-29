public class SumOfFirstNNum {
    
    //static int sum=0;
    
    public static void main(String[] args) {
        int n=100;
        //using recurssion
        System.out.println(sumOfNnnum(n));
        //using loop
        System.out.println(sumOfNum(n));
        //using formula
        System.out.println(sumOfNumFormula(n));

    }
    
    // using recurssion
    public static int sumOfNnnum(int n){
        if(n==1){
            return 1;
        }
        int i=sumOfNnnum(n-1);
        return i+n;
    }

    //using loop

    public static int sumOfNum(int n){
       int sum=0;
       
       for(int i=1;i<=n;i++){
        sum+=i;
       }

       return sum;
    }


    public static int sumOfNumFormula(int n){
        return (n*(n+1))/2;
    }
}
