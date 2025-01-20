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

public class RIBLL {

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
        Stack<Integer> s   = new Stack<>();

        Node temp = head;

        while(temp != null)
        {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null)
        {
            temp.data  = s.pop();
            temp = temp.next;
        }

        return head;
        
    }

    

    
 
}
