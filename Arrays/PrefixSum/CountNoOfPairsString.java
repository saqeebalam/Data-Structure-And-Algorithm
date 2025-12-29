//package Array.PrefixSum;

public class CountNoOfPairsString {
    public static void main(String[] args) {
        String str="abegag";
        //solution1
        findPairBF(str);
        //solution2
        findPairPS(str);
        //solution3
        findPairOp(str);
    }

    //T.C=O(n)
    //S.C=O(1)
    //carry forward technique
    public static void findPairOp(String str){
        int count_a=0,ans=0;
        char cArr[]=str.toCharArray();
        int n=cArr.length;

        for(int i=0;i<n;i++){
            if(cArr[i]=='a'){
                count_a+=1;
            }else if(cArr[i]=='g'){
                ans+=count_a;
            }
        }
        System.out.println("Pair count= "+ans);
    }


    /*
        using prefixsum
        T.C=O(n+n)=O(2n)
        S.C=O(n) due to prefix sum
    */
     public static void findPairPS(String str){

        int count=0;
        char cArr[]=str.toCharArray();
        int n=cArr.length;
        int ps[]=new int[n];

        if(cArr[0]=='a'){
            ps[0]=1;
        }else{
            ps[0]=0;
        }

        for(int i=1;i<n;i++){
            if(cArr[i]=='a'){
                ps[i]=ps[i-1]+1;
            }else{
                ps[i]=ps[i-1];
            }
        }


        for(int i=0;i<n;i++){
            if(cArr[i]=='g'){
                count+=ps[i];
            }
        }
        System.out.println("Pair count= "+count);
     }


    //brute force approch
    // T.C=O(N2)
    // S.C=O(1)
    public static void findPairBF(String str){
        int count=0;

        char cArr[]=str.toCharArray();
        int n=cArr.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(cArr[i]=='a' && cArr[j]=='g'){
                    count++;
                }
            }
        }

        System.out.println("Pair count= "+count);
    }
}
