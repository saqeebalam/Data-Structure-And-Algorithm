
//LeetCode:414
//URL:https://leetcode.com/problems/third-maximum-number/description/

public class Rd3MaxElemArr {
    public static void main(String[] args) {
        int arr[]={3,2,1};

        Rd3MaxElemArr rd1=new Rd3MaxElemArr();
        System.out.println(rd1.thirdMax(arr));
    }

    public int thirdMax(int[] nums) {

        int n=nums.length;
        int max=nums[0];
        int max2=nums[0];
        int max3=nums[0];
        
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max3=max2;
                max2=max;
                max=nums[i];
            }else if(nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>max3){
                max3=nums[i];
            }
        }

        return max3;
    }
}