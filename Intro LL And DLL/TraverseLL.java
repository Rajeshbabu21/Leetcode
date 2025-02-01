// Traverse a linked list
class Node {

 int data;
 Node next;


 Node(int data, Node next){

  this.data = data;
  this.next = next;
 }


  Node(int data)
  {
   this.data = data;
   this.next = null;
  }

 


}

public class TraverseLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node head = new Node(arr[0]);
        Node temp = head;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


 
}
