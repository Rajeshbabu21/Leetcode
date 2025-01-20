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

public class IKBDLL {

 public static void main(String[] args) {
  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert the array to a doubly linked list
  Node head = Arraytodll(arr);


  head = Insertkthb(head,11,2);

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

    public static Node Insertkthb(Node head,int data,int k){

        //if the list is empty
        if(head == null)
        {
            Node nn =new Node(data,null,null);
            return  nn;
        }


        //  k is 1
        if(k == 1)
        {
             Node nn  = new Node(data);
             nn.next = head;
             nn.back = null;
             head.back = nn;

             return nn;
           


        }

        // otherwise
        Node temp  = head;
        int count = 0;
        Node prev = head;

        while(temp != null)
        {
            count ++;

            // if the count is equal to k that is temp in the kth position
            if(count == k)
            {
                Node nn = new Node(data);
                prev = temp.back;
                nn.next = temp;
                prev.next = nn;
                temp.back = nn;
                nn.back = prev;
            }

            temp = temp.next;

        }
     return head;
    }
 
}
