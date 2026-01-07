

public class SelectionSort1 {
    public static void main(String[] args) {
        int arr[]={3,6,1,5,5,2,4};
        System.out.println("Before Sorting");
        
        for (int i : arr) {
            System.out.print(i+" ");
        }

        SelectionSort1 ss1=new SelectionSort1();
        ss1.sortSelection(arr);
        
        System.out.println("\nAfter Sorting");
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    /* Selection Sort Implementation 
        Time Complexity: O(n^2)
        Space Complexity: O(1)
    */
    public void sortSelection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int indicator=0;
            for(int j=i;j<n;j++){
                if(min>=arr[j]){
                    min=arr[j];
                    indicator=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[indicator]=temp;
        }
    }
}
