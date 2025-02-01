// Array to Linked List
class Node {

    int data;

    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DHLL {
 public static void main(String[] args) {
  int arr[] = {1,2,3,4,5,6,7,8,9,10};

  // Assign th e head to the first element of the array
  Node head = new Node(arr[0],null);

  // use the temp for c++
  Node temp  = head;

  // move the head to the next element
  head = head.next;

  // always return the head
  return head;




 }
 
}
