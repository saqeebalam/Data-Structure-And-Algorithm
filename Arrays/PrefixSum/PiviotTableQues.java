public class PiviotTableQues {

    //LeetCode 724
    //URL: https://leetcode.com/problems/find-pivot-index/description/
    public static void main(String[] args) {
        int arr[]={2,3,-1,8,4};
        System.out.println(findMiddleIndex(arr));
    }

    public static int findMiddleIndex(int[] nums) {
        int n=nums.length;
        //
        int psLeft[]=new int[n];
        int psRight[]=new int[n];

        psLeft[0]=nums[0];
        psRight[n-1]=nums[n-1];

        for(int i=1;i<n;i++){
            psLeft[i]=psLeft[i-1]+nums[i];
        }

        for(int j=n-2;j>=0;j--){
            psRight[j]=psRight[j+1]+nums[j];
        }

        for(int i=0;i<n;i++){
            if(psLeft[i]==psRight[i]){
                return i;
            }
        }

        return -1;
    }
}
