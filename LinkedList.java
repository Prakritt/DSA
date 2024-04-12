public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next = null;

        Node(int value){
            data = value;
        }

    }

    public static LinkedList insert(LinkedList list,int data){

        Node new_node = new Node(data);
        
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last_node = list.head;
            while(last_node.next != null)
            {
                last_node = last_node.next;
            }
            last_node.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list)
    {
        Node head = list.head;
        System.out.println(head.data);
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String args[])
    {

        LinkedList newList = new LinkedList();

        newList = insert(newList, 1);
        newList = insert(newList, 2);
        newList = insert(newList, 3);
        newList = insert(newList, 4);
        newList = insert(newList, 5);

        printList(newList);

    }
    
}
