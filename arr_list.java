import java.util.ArrayList;
public class arr_list{
 static class Stack{
    ArrayList<Integer> arr = new ArrayList<>();
    public void push(int data) {
        arr.add(data);
    }

    public boolean isempty() {
        return arr.size()==0;
    }
    public int pop() {
        if(isempty()){
            return -1;
        }
        int top = arr.remove(arr.size()-1);
        return top;
    }

    public int peek() {
     return arr.get(arr.size()-1);
    }
 }
 public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(12);
    stack.push(90);
    stack.push(6);
 }
}