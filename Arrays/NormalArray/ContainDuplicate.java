import java.util.HashSet;

public class ContainDuplicate {
    //Leetcode 217
    //URL : https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4};

        ContainDuplicate cd=new ContainDuplicate();
        System.out.println(cd.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer>hset=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int elm=nums[i];
            if(!hset.contains(elm)){
                hset.add(elm);
            }else{
                return true;
            }
        }
        
        return false;
    }
}
