public class CountSort1 {
    
    //Scaler : https://www.scaler.com/academy/mentee-dashboard/class/397691/assignment/problems/21391?navref=cl_tt_nv
    public static void main(String[] args) {
        int arr[]={4, 2, 1, 3, 2};
       
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        CountSort1 cs1=new CountSort1();
        int ans[]=cs1.solve(arr);

        System.out.println("\nAfter Sorting");
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }

    //int arr[]={4, 2, 1, 3, 2};
    //   freq[]={0,1,2,1,1}
    // int arr[]={10,9,8};
    public int[] solve(int[] A) {
        int max=-1;
        for (int i : A) {
            if(max<i){
                max=i;
            }
        }
        int n=A.length;
        int freq[]=new int[max+1];

        for(int i=0;i<n;i++){
            freq[A[i]]++;
        }

        int idx=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            int j=freq[i];
            for(int k=0;k<j;k++){
                A[idx]=i;
                idx++;
            }
        }

        return A;
    }
}
