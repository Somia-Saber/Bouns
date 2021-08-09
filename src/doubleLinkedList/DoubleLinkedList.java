package doubleLinkedList;

public class DoubleLinkedList {  
    //A node class for doubly linked list
    
    Node head=null;
    Node tail = null;

    //add a node to the list
    public void addNode(int data) {
        Node myNode = new Node(data);

        if(head == null) {
            head = tail = myNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = myNode;
            myNode.previous = tail;
            tail = myNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

