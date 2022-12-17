public class practice{// creating linked list
  Node head;
    public class Node{
      int data;
      Node next;
    
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  // creating add method as fisrt add
  public void createFirst(int data){
   Node node = new Node(data);
   node.next = head;
   head = node;
  }
// creating method for storing elemnet at last
public void createLast(int data){
  if(head== null){
    createFirst(data);
    return;
  }
  Node node = new Node(data);
Node temp = head;
while(temp.next!=null){
temp = temp.next;
}
temp.next = node;
temp = node;
}



  // creating print method
  public void printList(){
    Node temp = head;
    while(temp!=null){
      System.out.println("list is" +temp.data);
      temp = temp.next;
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
// searching for element
public void searchForElem(int key){
Node temp = head;
while(temp!=null){
  if(temp.data == key){
    System.out.println("element found");
    return;
  }
  temp = temp.next;
}
}

public void addOnRandom(int data,int index){
  if(head==null){
    createFirst(data);
  }

}

  public static void main(String[] args) {
    practice p = new practice();
    p.createFirst(90);
    p.createFirst(67);
    p.createLast(78);
    p.deleteNodeFirst();
   p.printList();
   p.searchForElem(67);
  }
 } 
 
 