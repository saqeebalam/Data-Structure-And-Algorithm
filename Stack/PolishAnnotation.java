package Stack;
import java.util.Stack;

public class PolishAnnotation {
    
    public static void main(String[] args) {
        String token[]={"2","1","+","3","*"};
            
            System.out.println(evalRPN(token));
    }   

    public static  int evalRPN(String[] tokens) {

        Stack<Integer>st=new Stack<>();

        int len=tokens.length;

        if(len==0){
            return -1;
        }

        for(int i=0;i<len;i++){
            if(tokens[i].equalsIgnoreCase("+") ||
               tokens[i].equalsIgnoreCase("-" )||
               tokens[i].equalsIgnoreCase("*" )||
               tokens[i].equalsIgnoreCase("/" )){
                if(st.isEmpty()){
                    return -1;
                }
                int a=0;
                if(!st.isEmpty()){
                     a=st.pop();
                }
                int b=0;
                if(!st.isEmpty()){
                     b=st.pop();
                }
                int sum;
                if(tokens[i].equalsIgnoreCase("+")){
                    sum=a+b;
                    st.push(Integer.valueOf(sum));
                }

                if(tokens[i].equalsIgnoreCase("-")){
                    sum=b-a;
                    st.push(Integer.valueOf(sum));
                }

                if(tokens[i].equalsIgnoreCase("*")){
                    sum=a*b;
                    st.push(Integer.valueOf(sum));
                }

                if(tokens[i].equalsIgnoreCase("/")){
                    sum=b/a;
                    st.push(Integer.valueOf(sum));
                }
            }else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }

        return st.pop();
    }
}
