import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    //LeetCode 229
    //URL : https://leetcode.com/problems/majority-element-ii/description/
    public static void main(String[] args) {
        int arr[]={3, 2, 3, 1, 3, 2, 1, 1};
        MajorityElement2 mj2=new MajorityElement2();
        System.out.println(mj2.majorityElement(arr).toString());
    }

    public List<Integer> majorityElement(int[] nums) {
        // Using Boyer-Moore Voting Algorithm extended for finding elements appearing more than n/3 times
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 1; // Initialize with different values to avoid conflicts
      
        // First pass: Find potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                // Current number matches candidate1, increment its count
                count1++;
            } else if (num == candidate2) {
                // Current number matches candidate2, increment its count
                count2++;
            } else if (count1 == 0) {
                // candidate1's count is 0, replace it with current number
                candidate1 = num;
                count1++;
            } else if (count2 == 0) {
                // candidate2's count is 0, replace it with current number
                candidate2 = num;
                count2++;
            } else {
                // Current number doesn't match either candidate and both have non-zero counts
                // Decrement both counts (elimination step)
                count1--;
                count2--;
            }
        }
      
        // Second pass: Verify if candidates actually appear more than n/3 times
        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 = 0;
      
        // Count actual occurrences of both candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
      
        // Check if candidate1 appears more than n/3 times
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
      
        // Check if candidate2 appears more than n/3 times
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }
      
        return result;
    }
}
