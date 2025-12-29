import java.util.HashMap;
import java.util.HashSet;

public class CountReverse {
    //LeetCode 2442
    //URL:https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/

    public static void main(String[] args) {
        int arr[]={1,13,10,12,31,0,0,0,0,0};
        int n=5;
        System.out.println(countDistinctIntegers(arr,n));
    }

    public static int countDistinctIntegers(int[] nums,int n) {
        HashSet<Integer>hset=new HashSet<>();

        for(int i=0;i<n;i++){
            int number=nums[i];
            hset.add(number);
            int revNum=reverse(number);
            hset.add(revNum);
            nums[n+i]=revNum;
        }

        return hset.size();
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
