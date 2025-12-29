public class ReverseArr {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        reverseArrayItterative(arr);
        reverseArrayOp(arr);
    }

    //optimize two pointer technique
    //T.C=O(n/2) ~ O(n)
    //S.C=O(1)
    public static void reverseArrayOp(int arr[]){
        int n=arr.length;

        int p1=0;//pointer one starting of an array
        int p2=n-1;//pointer two ending of an array

        while(p1<p2){ //if p1<p2 then p2 is swap with p1
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;

            p1++;
            p2--;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    //Itterative approuch
    //T.C=O(n)
    //S.C=O(n)
    public static void reverseArrayItterative(int arr[]){
        int n=arr.length;
        int revArr[]=new int[n];

        for(int i=0;i<n;i++){
            revArr[i]=arr[n-i-1];
        }

        for (int i : revArr) {
            System.out.print(i+" ");
        }
    } 
}
