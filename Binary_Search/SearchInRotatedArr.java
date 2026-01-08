
//LeetCode 33
// URL: https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=array

public class SearchInRotatedArr {

    public static void main(String[] args) {
        int arr[]={1,3};

        SearchInRotatedArr s1=new SearchInRotatedArr();
        System.out.println(s1.search(arr, 3));
    }

    public int search(int[] nums, int target) {
        int n = nums.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // target found
            if (nums[mid] == target) {
                return mid;
            }

            //  Left half is sorted
            if (nums[left] <= nums[mid]) {

                // target lies in left sorted half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } 
                // target lies in right half
                else {
                    left = mid + 1;
                }

            } 
            //  Right half is sorted
            else {

                // target lies in right sorted half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } 
                // target lies in left half
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public int binarySearch(int nums[],int left,int right,int target){
        
        while(left<=right){
        int mid=left+(right-left)/2;

        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return -1;
    }
}