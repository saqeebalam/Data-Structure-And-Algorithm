public class CountSortNegativeValue {
    public static void main(String[] args) {
        int arr[]={-2,3,8,3,-2,3};

        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        CountSortNegativeValue csnv=new CountSortNegativeValue();
        int ans[]=csnv.solve(arr);

        System.out.println("\nAfter Sorting");
        for (int i : ans) {
            System.out.print(i+" ");
        }

    }

    //int arr[]={-2,3,8,3,-2,3};
    public int[] solve(int[] A) {

        int lenA=A.length;

        int min=A[0];
        int max=A[0];
        for (int i : A) {
            max=Math.max(max, i);
            min=Math.min(min, i);
        }

        int totalLen=max-min;
        int freq[]=new int[totalLen+1];

        for(int i=0;i<lenA;i++){
            freq[A[i]-min]++;
        }
        int idx=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }

            int j=freq[i];
            for(int k=0;k<j;k++){
                A[idx]=i+min;
                idx++;
            }
        }

        return A;
    }
}
