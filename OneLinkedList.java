public class OneLinkedList<T> implements LinkedList<T>{
    private NodeOneLinked<T> head;
    private NodeOneLinked<T> tail;
    private NodeOneLinked<T> iterator;
    private int size;

    public OneLinkedList(){
        size = 0;
        head = null;
        tail = null;
        iterator = null;
    }

    public NodeOneLinked<T> getIterator() {
        return iterator;
    }

    public void setIterator(NodeOneLinked<T> iterator) {
        this.iterator = iterator;
    }

    public NodeOneLinked<T> getHead() {
        return head;
    }

    public void setHead(NodeOneLinked<T> head) {
        this.head = head;
    }

    public NodeOneLinked<T> getTail() {
        return tail;
    }

    public void setTail(NodeOneLinked<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public void addFront(T data){
        if(isEmpty()){
            NodeOneLinked<T> Node = new NodeOneLinked<T>();
            Node.setData(data);
            head = Node;
            tail = Node;
        }
        else{
            NodeOneLinked<T> Node = new NodeOneLinked<T>();
            Node.setData(data);
            Node.setNext(head);
            head = Node;
        }
        size++;
    }

    public void addBack(T data){
        if(isEmpty()){
            NodeOneLinked<T> Node = new NodeOneLinked<T>();
            Node.setData(data);
            head = Node;
            tail = Node;
        }
        else{
            NodeOneLinked<T> Node = new NodeOneLinked<T>();
            Node.setData(data);
            tail.setNext(Node);
            tail = Node;
        }
        size++;
    }

    public void insert(T data, int position){
        if(position == 1){
            addFront(data);
        }
        else if(position == getSize()+1){
            addBack(data);
        }
        else if(position > 1 && position <= getSize()){
            int count = 1;
            iterator = head;
            while(count != position-1){
                iterator = iterator.getNext();
                count++;
            }
            NodeOneLinked<T> Node = new NodeOneLinked<T>();
            Node.setData(data);
            Node.setNext(iterator.getNext());
            iterator.setNext(Node);
            size++;
        }
        else{
            System.out.println("Position is incorrect. Input other number");
        }
    }

    public void removeFront(){
        if(isEmpty()){
            System.out.println("List is Empty. Cant remove the element");
        }
        else{
            head = head.getNext();
            size--;
        }
    }

    public void removeBack(){
        if(isEmpty()){
            System.out.println("List is Empty. Cant remove the element");
        }
        else{
            iterator = head;
            while (iterator.getNext() != tail){
                iterator = iterator.getNext();
            }
            iterator.setNext(null);
            tail = iterator;
            size--;
        }
    }

    public void delete(int position){
        if(isEmpty()){
            System.out.println("List is Empty. Cant remove the element");
        }
        else if (position==1){
            removeFront();
        }
        else if(position == getSize()){
            removeBack();
        }
        else if(position > 1 && position < getSize()){
            int count = 1;
            iterator = head;
            while (count != position-1){
                iterator = iterator.getNext();
                count++;
            }
            iterator.setNext(iterator.getNext().getNext());
            size--;
        }
        else {
            System.out.println("Position is incorrect. Input other number");
        }
    }

    public int getIndex(T data){
        iterator = head;
        int count = 0;
        while(iterator != tail.getNext()){
            if(iterator.getData().equals(data)){
                return count;
            }
            count++;
            iterator = iterator.getNext();
        }
        return -1; // Value is not found
    }

    public void display(){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            iterator = head;
            while(iterator != tail.getNext()){
                System.out.print(iterator.getData() + " ");
                iterator = iterator.getNext();
            }
            System.out.println();
        }
    }

    public void clear(){
        size = 0;
        iterator = null;
        head = null;
        tail = null;
    }


}
