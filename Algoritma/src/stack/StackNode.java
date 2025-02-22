package stack;

public class StackNode <T> {
    private Node<T> top;
    private int size;

    public StackNode(){
        this.top = null;
        this.size = 0;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data + " ddimasukan ke stack");
    }


    public boolean isEmpty(){
        return  top == null;
    }

    public T pop(){
        if(isEmpty()){
            throw  new RuntimeException("Stack kosong");
        }
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack kosong");
        }
        return top.data;
    }
    public int getSize(){
        return this.size;
    }
    public void displaystack(){
        if(isEmpty()){
            System.out.println("Stack kosong");
            return;
        }
        Node<T> temp = top;
        System.out.print("Stack : ");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
