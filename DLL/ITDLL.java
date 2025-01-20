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

public class ITDLL {

 public static void main(String[] args) {
  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert the array to a doubly linked list
  Node head = Arraytodll(arr);


  head = Inserttail(head,11);

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

    public static Node Inserttail(Node head,int data){

        if(head == null)
        {
            Node nn =new Node(data,null,null);
            return  nn;
        }

        if(head.next == null)
        {
             Node nn  = new Node(data);
             head.next = nn;
             nn.back = null;
             nn.next = null;


        }

        Node temp  = head;

        // traverse to the last node
        while(temp.next != null)
        {
            temp  =  temp.next;

        }

        // create the new node
        Node nn = new Node(data);

        // points to null
        nn.next = null;

        // points to temp
        nn.back = temp;

        //  temp points to the new node
        temp.next  = nn;


     




     return head;

     



    }
 
}
