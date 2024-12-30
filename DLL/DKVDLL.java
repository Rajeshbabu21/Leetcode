package DLL;



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

public class DKVDLL {

 public static void main(String[] args) {
  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert the array to a doubly linked list
  Node head = Arraytodll(arr);

  int val = 2 ;

  head = Deletekthval(head,val);

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

    public static Node Deletekthval(Node head,int k){

     Node prev = head;
     Node front = head;
     Node temp = head;

     

     
     if(front == null )
     {
          temp = head
          prev  = head;
         
         while(temp.next != null)
         {
             temp = temp.next;
             
         }
         
         prev = temp.back;
         prev.next = null;
         temp.back = null;
         
         return head;
         
         
     }

     while(temp != null)
     {

        if(  temp.data ==  k)

        {
            prev  = temp.back;
            front  = temp.next;
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        temp = temp.next;



     }

     return head;

     



    }
 
}
