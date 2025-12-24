package String;
public class StringReversPart {
    public static void main(String[] args) {
        System.out.println(solve("abcdefghijkl", 2, 6));
    }

     public static String solve(String s, int L, int R)
    {
        String ans="";
        StringBuffer stB=new StringBuffer(s.substring(L, R+1));
        String reverse= stB.reverse().toString();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(i>=L && i<=R){
                ans+=reverse.charAt(j);
                j++;
            }else{
                ans+=s.charAt(i);
            }
            
        }

        return ans;
    }
}
