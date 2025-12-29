public class FindEvenElemInArr {
    /**
     * Given an arr[n] we have to find count of even element in an array
     * Approuch 1 : Brute force two loop
     * Approuch : Prefix Sum .
     */

    public static void main(String[] args) {
        int arr[]={3,6,2,4,3,1,9,5,7};
        int q[][]={{1,5},{2,7},{5,6}};
        countEvenElemBF(arr, q);
        countEvenElemPS(arr, q);
    }

    //Using Prefix sum
    //T.C=O(n+q)    here n= for prefix sum and q=no of queries
    //S.C=O(n) due to prefix sum
    public static void countEvenElemPS(int arr[],int q[][]){
        int n=arr.length;
        int qLen=q.length;

        int psEven[]=new int[n];

        if(arr[0]%2==0){
            psEven[0]=1;
        }else{
            psEven[0]=0;
        }

        for(int i=1;i<n;i++){
            if(arr[i]%2==0){
                psEven[i]=psEven[i-1]+1;
            }else{
                psEven[i]=psEven[i-1];
            }
        }

        for(int i=0;i<qLen;i++){
            int l=q[i][0];
            int r=q[i][1];
            int count=0;
            if(l>0){
                count=psEven[r]-psEven[l-1];
            }else{
                count=psEven[r];
            }
            System.out.println("Even number present on subArray l:"+l+" r:"+r+" count:"+count);

        }
    }

    
    //Brute Force
    //T.C=O(q*n)
    //S.C=O(1)
    public static void countEvenElemBF(int arr[],int q[][]){
        int n=arr.length;
        int qLen=q.length;
        
        for(int i=0;i<qLen;i++){
            int l=q[i][0];
            int r=q[i][1];
            int count=0;
            for(int j=l;j<=r;j++){
                if(arr[j]%2==0){
                    count++;
                }
            }

            System.out.println("Even number present on subArray l:"+l+" r:"+r+" count:"+count);
        }

    }
}
