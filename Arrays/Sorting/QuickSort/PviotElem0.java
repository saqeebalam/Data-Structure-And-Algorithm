
public class PviotElem0 {
    public static void main(String[] args) {
        int arr[]={54,26,93,17,77,60,44,55,20};

        PviotElem0 pv = new PviotElem0();
        int ans[]=pv.pviotSolve(arr, 0, arr.length-1,arr[0]);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }

    public int[] pviotSolve(int arr[],int s,int e, int pviot){

        int l=s+1;
        int r=e;

        while (l<=r) {
            if(arr[l]<pviot){
                l++;
            }else if(arr[r]>pviot){
                r--;
            }else{
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }

        }
        int temp=arr[r];
        arr[r]=arr[s];
        arr[s]=temp;

        return arr;
    }
}
