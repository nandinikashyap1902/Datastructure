public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNodeFirst() {
        if (head == null) {
            System.out.println("there is no list");
            return;
        }

        head = head.next;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("nothing for delete");
            return;
        }

        if (head.next == null) { // if list have only one elemnet
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) { // head.next = null -> lastNode = null // null.next
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList() {
    Node temp = head;
    while(temp.next!=null){
        System.out.println("temp.data");
        temp = temp.next;
    }
    }

    public static void main(String[] args) {
        LL l1 = new LL();
        l1.deleteNodeFirst();
        l1.deleteLast();
    }
}
