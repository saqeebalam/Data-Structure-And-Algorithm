
//Merge o sorted array
//int arr1[]={2,8,14,15,18,21,27};
//int arr2[]={1,9,10,11,19};

public class MergeToSortedArray {

    public static void main(String[] args) {
        int arr1[]={2,8,14,15,18,21,27};
        int arr2[]={1,9,10,11,19};

        System.out.println("Before Merge array");
        System.out.println("\n First Array");
        for (int i : arr1) {
            System.out.print(" "+i);
        }

        System.out.println("\n Second Array");
        for (int i : arr2) {
            System.out.print(" "+i);
        }

        MergeToSortedArray m1=new MergeToSortedArray();

        int ans[]=m1.mergeToArr(arr1, arr2);
        
        System.out.println("\n After Merging Array");
        for (int i : ans) {
            System.out.print(" "+i);
        }
    }

    public int[] mergeToArr(int arr1[],int arr2[]){

        int arr1Len=arr1.length;
        int arr2Len=arr2.length;

        int ans[]=new int[arr1Len+arr2Len];
        int i=0;//arr1Len
        int j=0;//arr2Len

        int idx=0;
        while (i<arr1Len && j<arr2Len) {
            if(arr1[i]>arr2[j]){
                ans[idx]=arr2[j];
                idx++;
                j++;
            }else{
                ans[idx]=arr1[i];
                idx++;
                i++;
            }
        }

        while (i<arr1Len) {
            ans[idx]=arr1[i];
            idx++;
            i++;
        }

        while (i<arr2Len) {
            ans[idx]=arr2[j];
            idx++;
            j++;
        }


        return ans;
    }
}
