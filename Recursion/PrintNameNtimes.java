public class PrintNameNtimes {
    public static void main(String[] args) {
        int n=3;
        printName(n);   
    }

    private static void printName(int n) {
        if(n==0){
            return;
        }
        printName(n-1); //here if we put n-- then it give stackoverflow exception because this is post decrement.
        //and if wdo --n then it run perfectly.
        System.out.print("MSI ");
        
    }

    
}
