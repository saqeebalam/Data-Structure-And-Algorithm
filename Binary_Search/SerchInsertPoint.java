package Binary_Search;
public class SerchInsertPoint {
    
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=2;
        System.out.println("Ans: "+searchInsert(nums, target));
    }
    
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(target>nums[n-1]){
            return n;
        }

        if(target<nums[0]){
            return 0;
        }

        int left=0;
        int right=n-1;
        

        while(left<=right){
            int mid=left + (right - left) / 2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return left;
    }
}
