//package SubArray;

public class PrintAllSubArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        printSubArrBF(arr);
    }


    //brute force
    //T.C=O(n3)
    public static void printSubArrBF(int arr[]){

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    if(k==j){
                        System.out.print(arr[k]);
                    }else{
                        System.out.print(arr[k]+",");
                    }
                }
                System.out.println("]");
            }
        }
    }
}