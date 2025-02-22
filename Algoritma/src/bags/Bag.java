package bags;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag <Item> implements  Iterable<Item> {

    private Node<Item> node;
    private int size;

    public Bag(){
        this.node = null;
        this.size = 0;
    }

    public void add(Item item){
        Node<Item> oldNode = node;
        node = new Node<>(item);
        node.next = oldNode;
        size++;
    }

    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return size == 0;
    }


    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements  Iterator<Item>{

        private Node<Item> current = node;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if(!hasNext()){
                throw  new NoSuchElementException();
            }
            Item data = current.data;
            current = current.next;
            return data;
        }
    }
}
