// 20. Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
// determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.
 
package LeetCodeSolutions;
import java.util.Stack;
public class ValidParentheses {
    public static boolean ValidParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            //if the string contains any of the following character
            if(ch == '(' || ch =='[' || ch =='{'){
                stack.push(ch); //push it to stack
            }
            //else check if the stack is empty or the char present in stack is the pair of given char
            else{
                if(stack.isEmpty() || (stack.peek()=='(' && ch!=')') || (stack.peek()=='{'&& ch!='}') || stack.peek()=='['&& ch!=']'){
                return false; //if not then return false
            }
             stack.pop();//pop every char from stack
            }
            
        }
        return stack.isEmpty();
        //if the stack is empty after poping out char, it means we have valid parentheses, else noot
    }
    public static void main(String[] args) {
        String s ="()[]{}";
       
        System.out.println("Is Valid ? "+ValidParentheses(s));
    }
    
}
