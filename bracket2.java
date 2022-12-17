import java.util.Stack;
public class bracket2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String str = "(())}";
        for(int i =0;i<str.length();i++){
        if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
            st.push(i);
        }
        else if(!st.empty()&&(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')){
            st.pop();
        }
        else{
            st.push(i);        }
    }
        if(st.empty()){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
        }
    }
