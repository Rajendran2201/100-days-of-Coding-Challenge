/*  This is the code for the implementation of a Custom LinkedList which allows us to add a value ainto it and print the entire List  */


public class LL {
    
    private Node head;                          //It refers to the first element in the Linked List
    private Node tail;                          //It refers to the last element in the Linked List
    
    private int size;                           //It refers to the size of the Linked list 

    public LL() {
        this.size = 0;                          //Initially, the size of the linkedlist is assigned as zero by default
    }
/***************************************************************************************************************/

    public void insertFirst(int val){           // Method to insert the values into a Linkedlist
        Node node = new Node(val); 
        node.next = head;                        //When a new value is added into the LinkedList, it points to head 
        head = node;                             //Therefore , the inserted value is updated as out new head 

        if(tail == null){                        //When there is no tail , it means that It is the first element in the list thus we assume that it is out head as well.
            tail = head;
        }

        size += 1;                                //Whenever we insert a value into the LinkedList , the size of it increases by 1
    }

    public void display(){
        Node temp = head;                               //On traversing the LinkedList using the head, it may change the position of head. Inorder to avoid that we can use a temporary variable which is like a duplicate head for out traversal.
        while(temp!=null){                              //Condition to print till the last element of the LinkedList
            System.out.print(temp.value + " -> ");      // Prints the value of each node 
            temp = temp.next;                           // this is basically like incrementing the node 
        }
        System.out.println("END");

    }

/****************************************************************************************************************/

     //Implementation of Node class 

    private class Node {                         
        private int value;
        private Node next;
        
        public Node(int value, LL.Node next) {      //Parametrised Constructor with two parameters
            this.value = value;
            this.next = next;
        }

        public Node(int value) {                     //Constructor with one parameter which contains the value 
            this.value = value;
        }

        
    }
}
