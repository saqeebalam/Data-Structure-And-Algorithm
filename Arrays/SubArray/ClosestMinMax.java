public class ClosestMinMax {
    public static void main(String[] args) {
     int arr[]={2, 6, 1, 6, 9};  
     System.out.println(solve(arr)); 
    }

    public static int solve(int[] A) {
        int n = A.length;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        // Step 1: Find min and max values in the array
        for (int num : A) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        // Step 2: Traverse and find smallest subarray containing both min and max
        int minIndex = -1, maxIndex = -1;
        int minLength = n;

        for (int i = n - 1; i >= 0; i--) {
            if (A[i] == minVal) {
                minIndex = i;
                if (maxIndex != -1) {
                    minLength = Math.min(minLength, maxIndex - minIndex + 1);
                }
            }
            if (A[i] == maxVal) {
                maxIndex = i;
                if (minIndex != -1) {   
                    minLength = Math.min(minLength, minIndex - maxIndex + 1);
                }
            }
        }

        return minLength;
    }
}
