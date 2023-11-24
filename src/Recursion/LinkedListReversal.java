package Recursion;



public class LinkedListReversal {
    Node head;
    LinkedListReversal(){
        this.head=null;
    }

    public void reverse() {
        head = reverse(head, null);
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node reverse(Node current,Node prev){
        if(current==null){
            return prev;
        }
        Node nextNode=current.next;
        current.next=prev;
        prev=current;
        current=nextNode;

        return reverse(current,prev);
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public static void main(String[] args) {
        LinkedListReversal linkedList = new LinkedListReversal();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println("Original linked list:");
        linkedList.printList();

        linkedList.reverse();

        System.out.println("Reversed linked list:");
        linkedList.printList();
    }
}
