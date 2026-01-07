public class InsertationSort1 {
    public static void main(String[] args) {
        int arr []={6,8,2,7,5};
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        InsertationSort1 ins1=new InsertationSort1();
        ins1.sortInsertation(arr);

        System.out.println("\nAfter Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    //int arr []={6,8,2,7};
    /* Insertion Sort Implementation 
        Time Complexity: O(n^2)
        Space Complexity: O(1)
        Worest Case Time: O(n^2)
        Best Case Time: O(n)
        Average Case Time: O(n^2)
        
        Worst Case Comparisons: O(n^2)
        Worst Case Swaps: O(n^2)

    */
    public void sortInsertation(int arr[]){
        int n=arr.length;

        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
