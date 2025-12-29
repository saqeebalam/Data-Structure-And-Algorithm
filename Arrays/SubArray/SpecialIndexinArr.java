public class SpecialIndexinArr {
    /*
     Special index are those index if we remove a element from index then from that left index = right index
     ex: arr{4,3,2,7,6,-2}

     index    remaining array
     0        3,2,7,6,-2   even:3+7+-2=8 odd:6+2=8 true <--
     1        4,2,7,6,-2   even:4+7+-2=9 odd:6+2=8 false
     2        4,3,7,6,-2   even:4+7+-2=9 odd:3+6=9 true <--
     3        4,3,2,6,-2   even:4+2+-2=4 odd:6+3=9 false
     4        4,3,2,7,-2   even:4+2+-2=4 odd:7+3=10 false
     5        4,3,2,7,6   even:4+2+6=12 odd:7+3=10 false
     
     if we see clearly we which element is removing after that even index move to odd and odd move to even.
     special index sum = oddIndexSum = evenIndexSum
     special index sum = evenIndex Before I +oddIndex after I = oddIndex before I + evenIndex after I
    
     formula : psEven[i-1] + psOdd[n-1]-psOdd[i] == psOdd[i-1] + psEven[n-1] -psEven[i]
    


     */

     public static void main(String[] args) {
        int arr[]={4,3,2,7,6,-2};
        System.out.println(getSpecialIndexCount(arr));
     }

     public static int getSpecialIndexCount(int arr[]){
        int ans=0;
        int n=arr.length;

        int psEven[]=new int[n];
        int psOdd[]=new int[n];

        psEven[0]=arr[0];
        psOdd[0]=0;

        for(int i=1;i<n;i++){
            if(i%2==0){
                psEven[i]=psEven[i-1]+arr[i];
                psOdd[i]=psOdd[i-1];
            }else{
                psOdd[i]=psOdd[i-1]+arr[i];
                psEven[i]=psEven[i-1];
            }
        }

        //for index 0
        if(psEven[n-1]-psEven[0]==psOdd[n-1]-psOdd[0]){
            ans+=1;
        }

        for(int i=1;i<n;i++){
            if(psEven[i-1]+psOdd[n-1]-psOdd[i]==psOdd[i-1]+psEven[n-1]-psEven[i]){
                ans+=1;
            }
        }


        return ans;
     } 
}
