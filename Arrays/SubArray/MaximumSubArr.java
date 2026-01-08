
//LeetCode : 43
//URL : https://leetcode.com/problems/maximum-subarray/description/?envType=problem-list-v2&envId=array

public class MaximumSubArr {

    public static void main(String[] args) {
        int arr[]={-3,-2,-2,-3};

        MaximumSubArr m1=new MaximumSubArr();
        System.out.println(m1.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=-1;
        int n=nums.length;

        if(n==1){
            return nums[0];
        }
        // int arr[]={-3,-2,-2,-3};
        //For negative value
        int negMin=nums[0];
        int negMax=nums[0];

        for (int i : nums) {
            if(i<negMax){
                negMax=i;
            }else if(i>negMin){
                negMin=i;
            }
        }

        if(negMin<0 && negMax<0){
            return negMin;
        }

        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum<0){
                sum=0;
            }else if(maxSum<sum){
                maxSum=sum;
            }
        }

        return maxSum;
    }
}
