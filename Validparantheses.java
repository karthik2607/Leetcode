
//20
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false
 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.

import java.util.*;

public class Validparantheses {
   static Boolean  isValid(String s){
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char top=st.peek();
                    if((c==')' && top=='(') || (c==']' && top==']') || (c=='}' && top=='{')){
                        st.pop();

                    }else{
                        return false;
                    }

                }
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean answer=isValid(s);
        System.out.print(answer);
    }
    
}
