public class LeftSumRightSum {

    //LeetCode 2574
    //URL:https://leetcode.com/problems/left-and-right-sum-differences/description/
    public static void main(String[] args) {
        int arr[]={1};
        int ans[]=leftRightDifference(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] leftRightDifference(int[] nums) {
        
        int n=nums.length;
        int leftSum[]=new int[n];
        int rightSum[]=new int[n];

        leftSum[0]=0;
        rightSum[n-1]=0;
        
        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }

        for(int j=n-2;j>=0;j--){
            rightSum[j]=rightSum[j+1]+nums[j+1];
        }

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }

        return ans;
    }
}