import java.util.*;
package problems on LL;



class Node {
    int data;
    Node next;
    Node back;

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }


}

public class RIOLL {

 public static void main(String[] args) {
  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert the array to a doubly linked list
  Node head = Arraytodll(arr);


  head = ReverseLL(head);

  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }




  
 }


     public static Node Arraytodll(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.back = prev;
            prev = temp;
        }

        return head;
    }



    public static Node ReverseLL(Node head)
    {
      Node prev = null;
      Node temp = head;
      Node front  = head;

      while(temp != null)
      {
       front = temp.next;
       temp.next = prev;
       prev = temp;
       temp = front;
      }

      return prev;
        
    }

    

    
 
}