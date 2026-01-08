public class QuickSort1 {
    public static void main(String[] args) {
        int arr[]={54,26,93,17,77,60,44,55,20};
        QuickSort1 qs=new QuickSort1();
        //Get piviot index
        //System.out.println(qs.getPviotIdx(arr, 0, arr.length-1));
        
        qs.qs(arr, 0, arr.length-1);
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public void qs(int arr[],int s,int e){
        if(s>=e){
            return;
        }

        int pviotIdx=getPviotIdx(arr, s, e);
        //left call
        qs(arr, s, pviotIdx-1);
        //right call
        qs(arr, pviotIdx+1, e);
    }

    public int getPviotIdx(int A[],int s, int e){
        int pviot=A[s];
        int l=s+1;
        int r=e;
        
        while (l<=r) {
            if(A[l]<=pviot){
                l++;
            }else if(A[r]>pviot){
                r--;
            }else{
                int temp=A[l];
                A[l]=A[r];
                A[r]=temp;
            }
        }

        int temp=A[r];
        A[r]=A[s];
        A[s]=temp;

        return r;
    }
}
