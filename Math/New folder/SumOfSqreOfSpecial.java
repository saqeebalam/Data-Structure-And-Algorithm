public class SumOfSqreOfSpecial {
    //Leetcode 2778
    //Url: https://leetcode.com/problems/sum-of-squares-of-special-numbers/

    public static void main(String[] args) {
        int arr[]={2,7,1,19,18,3};
        System.out.println(sumOfSquares(arr));
    }

    public static int sumOfSquares(int[] nums) {
        int ans=0;
        int n=nums.length;
        int count=1;
        for (int i : nums) {
            if(n%count==0){
                int sqrt=i*i;
                ans+=sqrt;
            }
            count++;
        }

        return ans;
    }
}
