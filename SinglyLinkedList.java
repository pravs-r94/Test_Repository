package LinkedLists;

public class SinglyLinkedList
{
    public Node head = null;
    public Node tail = null;

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public void addNode(int data)
    {
        Node newNode = new Node(data);

        //Checking if the list is empty
        if(head == null)
        {
            //head and tail will point to new node when list is empty
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display()
    {
        //Node current pointing to head
        Node current = head;

        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next; //Incrementing pointer
        }
        System.out.println();
    }


}

