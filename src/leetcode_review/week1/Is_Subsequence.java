package leetcode_review.week1;

import java.util.Stack;

public class Is_Subsequence {


    public static void main(String[] args) {

        String s = "b";
        String t = "jasdbfk";

        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {

        if(s.length() ==0) return true;

        Stack<Character> stk = new Stack<>();

        for(int i = 0; i< s.length(); i++){

            stk.push(s.charAt(i));
        }

        for(int j = t.length()-1; j>=0; j--){

            if(t.charAt(j) == stk.peek()){
                stk.pop();
            }
        }


        if(stk.empty()) return true;
        return false;

    }
}
