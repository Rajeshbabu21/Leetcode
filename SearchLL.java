
// Program to search an element in a linked list
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

public class SearchLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node head = new Node(arr[0]);
        Node temp = head;

        int count = 0;

        while(temp!=null)
        {

            // element is equal to 5
            if(temp.data == 5)
            {
                return 1;
            }
            temp = temp.next;
        }


    }

    // if not present
    return 0;


 
}
