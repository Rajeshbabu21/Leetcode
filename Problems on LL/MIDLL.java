package problems

import java.util.Stack;

on LL;



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

public class MIDLL {

 public static void main(String[] args) {
  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert the array to a doubly linked list
  Node head = Arraytodll(arr);

  int n = arr.length;
  head = MiddleLL(head,n);

//   Node temp = head;

System.out.println(head.data);

  




  
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

    public static Node MiddleLL(Node head,int n)
    {
        if(n%2 == 0)
        {
            return  evenMid(head,n);

        }
        else{
            return  oddMid(head,n);
        }

        


    }

    public static Node evenMid(Node head,int n)
    {
        int val = (int) Math.floor(n/2);
        int count = 0;

        Node temp = head;

        while(temp != null)
        {
            count = count +1;

            if(count == val)
            {
                return temp.next;

            }

            temp = temp.next;

        }
    }

    public static Node oddMid(Node head,int n)
    {
        int val = (int) Math.ceil(n/2);
        int count = 0;

        Node temp = head;

        while(temp != null)
        {
            count = count +1;

            if(count  == val)
            {
                return temp;

            }

            temp = temp.next;
        }
    }

    
 
}
