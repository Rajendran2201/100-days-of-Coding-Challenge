public class LinList {
    Node head;

    public LinList() {
        this.head = head;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}
