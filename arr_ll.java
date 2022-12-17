public class arr_ll {
    Node head;
    static class Node{
        int data;
        Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
// push element
public void push(int data) {
    Node node = new Node(data);
    if(head==null){
        head = node;
        return;
    }
    node.next = head;
    head = node;
}
// isempty
public boolean isempty() {
    return head == null;
}
//pop
public int pop() {
    if(isempty()){
        return -1;
    }
    Node top = head;
    head = head.next;
    return top.data;
}
public void print() {
    Node temp = head;
    System.out.println(temp.data);
}
public static void main(String[] args) {
arr_ll l1 = new arr_ll();
l1.push(1); 
l1.push(2); 
l1.push(3); 
l1.pop();
l1.print();
}
}