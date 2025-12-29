//package SubArray;

//Subarray Sum Equals K
public class SubArraySumK {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        
        System.out.println(subarraySum(arr, 3));
        System.out.println(sumOfAllSubArrPS(arr, 3));
    }
    

    public static int sumOfAllSubArrPS(int arr[],int k){
        int n=arr.length;
        int ps[]=new int[n];
        ps[0]=arr[0];
        
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        int countAns=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                if(i>0){
                    sum=ps[j]-ps[i-1];
                }else{
                    sum=ps[j];
                }
                if(sum==k){
                    countAns++;
                }
            }
        }

        return countAns;
    }

    //Brute Force
    //T.C=O(n3)
    //S.C=O(1)
    public static int subarraySum(int[] nums, int k) {
        int ans=0; 
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int l=i;l<=j;l++){
                    sum+=nums[l];
                }
                if(sum==k){
                    ans++;
                }
            }
        }

        return ans;
    }
}
