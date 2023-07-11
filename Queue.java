public class Queue {
    int front;
    int rear;
    int capacity;
    int noOfItem;

    int queueArr[];

    Queue(int size){
        capacity = size;
        front = 0;
        rear = -1;

        queueArr = new int[size];
    }


    boolean isFull(){
        return rear+1 == capacity;
    }

    boolean isEmpty(){
        return rear == -1;
    }

    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            queueArr[++rear] = x;
            System.out.println("added");
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            front++;
        }
    }

    void printQueue(){
        for(int i = front; i<=rear; i++){
            System.out.println(queueArr[i]);
        }
    }


    public static void main(String[] args){
        Queue myQueue = new Queue(5);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.printQueue();

        myQueue.enqueue(100);

        myQueue.printQueue();
    }
}
