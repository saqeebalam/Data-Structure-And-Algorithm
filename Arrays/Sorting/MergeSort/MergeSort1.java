public class MergeSort1 {
    public static void main(String[] args) {
        int arr[]={3,10,6,8,15,2,12,18,17};
        
        System.out.println("Before Sorting");
        for(int i : arr){
            System.out.print(" "+i);
        }

        MergeSort1 ms1=new MergeSort1();
        ms1.mergeSort(arr, 0, arr.length-1);

        System.out.println("\nAfter Sorting");
        for(int i : arr){
            System.out.print(" "+i);
        }

    }

    public void mergeSort(int A[],int l,int r){
        if(l>=r){
            return;
        }

        int mid=(l+r)/2;

        //Left Array sort
        mergeSort(A, l, mid);
        //Right Array sort
        mergeSort(A, mid+1, r);

        //Merging an Array
        mergerArray(A, l, mid, r);
    }

    public void mergerArray(int A[],int l,int mid,int r){
        int k=0;
        int i=l;
        int j=mid+1;

        int temp[]=new int[r-l+1];

        while (i<=mid && j<=r) {    
            if(A[i]<=A[j]){
                temp[k]=A[i];
                k++;
                i++;
            }else{
                temp[k]=A[j];
                j++;
                k++;
            }
        }//Swaping While end

        while (i<=mid) {
            temp[k]=A[i];
            k++;i++;
        }

        while (j<=r) {
            temp[k]=A[j];
            k++;j++;
        }

        for (int x = 0; x < temp.length; x++) {
            A[l + x] = temp[x];
        }
    }

}
