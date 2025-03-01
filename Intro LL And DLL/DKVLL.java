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





public class DKVLL {
 public static void main(String[] args) {

  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // Convert array to linked list
  Node head  = arrayToLinkedList(arr);

  head = Deletek(head,2);



  Node temp = head;



  // Print the linked list 
  while(temp != null)
  {
   System.out.print(temp.data + " -> ");
   temp = temp.next;
  }

  


 }

 // Function to convert an array to a linked list
 public static Node arrayToLinkedList(int[] arr) {

  Node head  = new Node(arr[0],null);
  // Node temp = head;
  Node mover  = head;

  for(int i = 1;i<arr.length;i++)
  {
   Node temp = new Node(arr[i],null);
   mover.next = temp;
   mover  = temp;
  }

  return head;
 }


 public static Node Deletek( Node head,int el)
 {

  // base condition

  if(head == null)
  {
   return null;
  }

  if(head.data == el)
  {
   head = head.next;
   return head;
  }

  Node temp = head;
  Node prev = null;

  // traverse the linked list
  while(temp != null)
  {

   //  y temp it is in the k position equal to el
   if(temp.data == el)
   {
    prev.next = prev.next.next;
    break;



   }

   // remember the previous node
   prev = temp;

   temp = temp.next;

  }

  // return the head
  return head;



 }
 
}
