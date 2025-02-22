package queue;

public class QueueNode <T> {
    private Node<T> front,rear;
    private int size;

    public QueueNode(){
        this.front = this.rear = null;
        this.size = 0;
    }

    public void add (T data){
        Node<T> newNode = new Node<>(data);
        if(rear == null){
            front = rear = newNode;

        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data + " dimasukan ke queue");
    }

    public boolean isEmpty(){
        return front == null;
    }

    public T dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue kosong");
        }
        T value = front.data;;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return value;
    }
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Queu ksong");
        }
        return front.data;
    }

    public int getSize(){
        return this.size;
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Quequq kosong");
            return;
        }
        Node<T> temp = front;
        System.out.print("Queu : ");
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
