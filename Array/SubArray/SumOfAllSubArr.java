public class SumOfAllSubArr {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        //solution1
        sumOfAllSubArrBF(arr);
        //solution2
        System.out.println();
        sumOfAllSubArrPS(arr);
    }


    //Prefix Approuch
    //T.C=O(N2)
    //S.C=O(N) due to prefix sum array
    public static void sumOfAllSubArrPS(int arr[]){
        int n=arr.length;
        int ps[]=new int[n];
        ps[0]=arr[0];
        
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                if(i>0){
                    sum=ps[j]-ps[i-1];
                }else{
                    sum=ps[j];
                }
                System.out.println(sum);
            }
        }
    }

    //Brute force
    //T.C=O(n3)
    //S.C=O(1)
    public static void sumOfAllSubArrBF(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                System.out.println(sum);
            }
        }
    }
}
