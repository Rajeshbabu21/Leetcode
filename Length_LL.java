// Length of a linked list
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

public class Length_LL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node head = new Node(arr[0]);
        Node temp = head;

        int count = 0;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }


        System.out.println("Length of the linked list is: " + count);
    }


 
}
