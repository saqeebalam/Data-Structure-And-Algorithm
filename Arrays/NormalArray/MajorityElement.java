//LeetCode 169
//URL : https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array

public class MajorityElement{
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        MajorityElement mjm=new MajorityElement();
        System.out.println(mjm.majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        int cnt=0;
        int candidate=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(candidate==0){
                candidate=nums[i];
                cnt++;
            }else if(candidate==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        return candidate;
    }
}