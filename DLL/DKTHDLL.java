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

public class DKTHDLL {

 public static void main(String[] args) {
  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert the array to a doubly linked list
  Node head = Arraytodll(arr);

  int k =(arr.length)-1 ;

  head = Deletekth(head,k);

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

    public static Node Deletekth(Node head,int k){

     Node prev = head;
     Node front = head;
     Node temp = head;
     int count = 0;

    //  if having one or nothing in the list
     if (head == null || head.next == null)
     {
        return null;
     }

    //  if the length the k val is 1
     if(k == 1)
     {
        head = head.next;
        head.back = null;
        prev.next = null;
        
        return head;
     }
     
    //  for the last element
     if(k == 8)
     {
          temp = head;
          front = head;
          prev  = head;
         
         while(temp.next.next != null)
         {
             temp = temp.next;
             
         }
         
         front = temp.next;
         temp.next  = null;
         front.back = null;
         
         return head;
         
         
     }

    //  k is between 1 and 8

     while(temp != null)
     {
        count ++;

        if(count == k)

        {
            prev  = temp.back;
            front  = temp.next;
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
            break;
        }
        temp = temp.next;



     }

     return head;

     



    }
 
}
