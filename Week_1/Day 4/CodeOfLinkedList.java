public class CodeOfLinkedList{
    public static void main(String[] args){
        LL list = new LL();
        
        //Inserting the values into the LinkedList
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        //Displaying the elements in the LinkedList
        list.display();
    }

    /*
     * OUTPUT : 6 -> 5 -> 4 -> 3 -> 2 -> END
     */

}