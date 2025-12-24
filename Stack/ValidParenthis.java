package Stack;
import java.util.Stack;

public class ValidParenthis {
    

    public static void main(String[] args) {
        String  A = "(()";
        //solve(A);
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        int flag=1;

        Stack<Character>st=new Stack<>();

        int n=A.length();

        if(n==0){
            return 0;
        }

        for(int i=0;i<n;i++){
            char c=A.charAt(i);
            if(c=='('){
                st.add(c);
            }else{
                if(st.isEmpty()){
                    return -0;
                }

                st.pop();
            }
        }
        if(st.isEmpty()){
            return flag;
        }else{
            return 0;
        }
    }
}
