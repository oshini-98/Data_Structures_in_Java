package LinkedList;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
            n = n.next;
           }
           n.next = node;
        }

    }

    void show(){
        Node n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }
        else{
            node.next = null;
            node.next = head;
            head = node;
        }
    }

    void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;

        Node n = head;

        if(index == 0){
            insertAtStart(data);
        }
        else{
            for(int i= 0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;    
        }
    }

    void deleteAt(int index){
        Node n = head;

        if(index == 0){
            head = head.next;
        }
        else{
            for(int i=0; i<index-1; i++){
                n=n.next;
            }
        }

        n.next = n.next.next;
    }


    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.insert(20);
        linkedList.insert(50);
        linkedList.insert(70);
        linkedList.insert(10);
        linkedList.insert(30);
        linkedList.show();

        linkedList.insertAtStart(60);
        System.out.println(" \nInsert At Start : ");
        linkedList.show();

        linkedList.insertAt(5, 90);
        System.out.println(" \nInsert At : ");
        linkedList.show();

        linkedList.deleteAt(4);
        System.out.println(" \nDelete At : ");
        linkedList.show();

    }
}
