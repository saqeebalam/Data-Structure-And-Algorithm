public class ValidPalindrome {
    //Leetcode 125
    //url: https://leetcode.com/problems/valid-palindrome/description/

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";  
        System.out.println(isValidPalindrome(s));
    }

    public static boolean isValidPalindrome(String s){

        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").trim();

         StringBuilder sb=new StringBuilder(str);

        if(str.equals(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }

    } 
}
