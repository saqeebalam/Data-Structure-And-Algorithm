public class PartationArrThree {
    
    //LeetCode 1013 - Partition Array Into Three Parts With Equal Sum


    public static void main(String[] args) {
        int arr[]={0,0,0,0};
        System.out.println(canThreePartsEqualSum(arr));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {

        int totalSum=0;
        
        for(int num:arr){
            totalSum+=num;
        }



        if(totalSum%3!=0){
            return false;
        }

        int partSum=totalSum/3;

        int sum=0;
        int counter=0;
        for (int i : arr) {
            sum+=i;
            if(sum==partSum){
                counter++;
                sum=0;
            }
        }

         return counter >= 3;

    }
}
