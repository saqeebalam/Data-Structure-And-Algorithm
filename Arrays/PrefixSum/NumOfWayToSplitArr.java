public class NumOfWayToSplitArr {
    
    //LeetCode Problem 2270: Number of Ways to Split Array
    //https://leetcode.com/problems/number-of-ways-to-split-array/
    public static void main(String[] args) {
        int arr[]={10,4,-8,7};
       // System.out.println(waysToSplitArray(arr));
        System.out.println(waysToSplitArrayOp(arr));
    }

    public static int waysToSplitArrayOp(int[] nums) {
        int count=0;

        int n=nums.length;

        int totalSum=0;

        for (int i : nums) {
            totalSum+=i;
        }    
        int left=0;
        int right=totalSum;
       
        for(int i=0;i<n-1;i++){
            left+=nums[i];
            right-=nums[i];
            if(left>=right){
                count++;
            }
        }

        return count;
    }

    //TC: O(n) SC: O(n)
    public static int waysToSplitArray(int[] nums) {
        int count=0;
        
        int n=nums.length;
        long ps[]=new long[n];
        
        ps[0]=nums[0];

        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }

        for(int i=0;i<n-1;i++){
            if(i>0){
                if(ps[i]>ps[n-1]-ps[i]){
                    count++;
                }
            }else{
                if(ps[i]>ps[n-1]-ps[0]){
                    count++;
                }
            }
        }

        return count;
    }
}
