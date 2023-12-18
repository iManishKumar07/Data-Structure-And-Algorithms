
public class LinkedList<Type> {
    Node head;
    class Node{
        Type data;
        Node pointer;
        Node(Type data){
            this.data = data;
            this.pointer = null;
        }
    }

    // add-First
    public void addFirst(Type data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.pointer = head;
        head = newNode;
    }
    //add-Last
    public void addLast(Type data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node tempNode = head;
        while (tempNode.pointer != null){
            tempNode = tempNode.pointer;
        }

        tempNode.pointer = newNode;
    }

    public void printNode(){
        if(head == null){
            System.out.println("LinkedList is Empty!");
            return;
        }

        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.data + " --> ");
            tempNode = tempNode.pointer;
        }
        System.out.println("NULL");
    }

    public void delFirst(){
        if(head == null){
            System.out.println("Linked list is Empty!");
            return;
        }
        if (head.pointer == null){
            head = null;
            return;
        }
        head = head.pointer;
    }

    public void delLast(){
        if(head == null){
            System.out.println("Linked list is Empty!");
            return;
        }
        if (head.pointer == null){
            head = null;
            return;
        }

        Node secLastNode = head;
        Node lastnode = head.pointer;

        while (lastnode.pointer != null){
            lastnode = lastnode.pointer;
            secLastNode = secLastNode.pointer;
        }
        secLastNode.pointer = null;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(21);
        list.addFirst(22);
        list.addFirst(23);
        list.delLast();
        list.delFirst();

        list.printNode();
    }
}
