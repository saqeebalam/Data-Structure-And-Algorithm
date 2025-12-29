public class DoubleReverse {
    //LeetCode 2119
    //URL:https://leetcode.com/problems/a-number-after-a-double-reversal/description/

    public static void main(String[] args) {
        int n=52600;
        System.out.println(isSameAfterReversals(n));
    }

     public static boolean isSameAfterReversals(int num) {
        boolean ans=false;

        int firstRevs=reverse(num);

        int secRevs=reverse(firstRevs);

        if(num==secRevs){
            ans=true;
        }

        return ans;
    }



     public static int reverse(int x) {
       
        int ans=0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (ans > Integer.MAX_VALUE / 10 || 
               (ans == Integer.MAX_VALUE / 10 && digit > 7)) return 0;

            if (ans < Integer.MIN_VALUE / 10 || 
               (ans == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            ans = ans * 10 + digit;
        }

        return ans;
    }
}
