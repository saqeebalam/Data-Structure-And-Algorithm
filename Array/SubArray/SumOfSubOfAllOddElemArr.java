public class SumOfSubOfAllOddElemArr {
    public static void main(String[] args) {
        int arr[]={3,6,2,4,3,1,9,5,7};
        int q[][]={{1,5},{2,7},{5,6}};
        sumOfAllOddElem(arr, q);
    }

    public static void sumOfAllOddElem(int arr[],int queries[][]){
        int n=arr.length;

        int ps[]=new int[n];
        ps[0]=0;

        for(int i=1;i<n;i++){
            if(i%2!=0){
                ps[i]=ps[i-1]+arr[i];
            }else{
                ps[i]=ps[i-1];
            }
        }

        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];

            int sum=0;

            if(l>0){
                sum=ps[r]-ps[l-1];
            }else{
                sum=ps[r];
            }

            System.out.println("Sum of Odd Index for l="+l+" and r="+r+": SUM="+sum);
        }

    }
}
