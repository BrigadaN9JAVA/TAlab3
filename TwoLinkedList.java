public class TwoLinkedList<T> implements LinkedList<T>{
    private NodeTwoLinked<T> head;
    private NodeTwoLinked<T> tail;
    private NodeTwoLinked<T> iterator;
    private int size;

    public TwoLinkedList(){
        size = 0;
        head = null;
        tail = null;
        iterator = null;
    }

    public NodeTwoLinked<T> getHead() {
        return head;
    }

    public void setHead(NodeTwoLinked<T> head) {
        this.head = head;
    }

    public NodeTwoLinked<T> getTail() {
        return tail;
    }

    public void setTail(NodeTwoLinked<T> tail) {
        this.tail = tail;
    }

    public NodeTwoLinked<T> getIterator() {
        return iterator;
    }

    public void setIterator(NodeTwoLinked<T> iterator) {
        this.iterator = iterator;
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
            NodeTwoLinked<T> Node = new NodeTwoLinked<>();
            Node.setData(data);
            head = Node;
            tail = Node;
        }
        else{
            NodeTwoLinked<T> Node = new NodeTwoLinked<>();
            Node.setData(data);
            Node.setNext(head);
            head.setPrevious(Node);
            head = Node;
        }
        size++;
    }

    public void addBack(T data){
        if(isEmpty()){
            NodeTwoLinked<T> Node = new NodeTwoLinked<>();
            Node.setData(data);
            head = Node;
            tail = Node;
        }
        else{
            NodeTwoLinked<T> Node = new NodeTwoLinked<>();
            Node.setData(data);
            Node.setPrevious(tail);
            tail.setNext(Node);
            tail = Node;
        }
        size++;
    }

    public void insert(T data, int position){
        if(position == 1){
            addFront(data);
        }
        else if(position == size+1){
            addBack(data);
        }
        else if(position > 1 && position <= size){
            int count = 1;
            iterator = head;
            while(count != position-1){
                iterator = iterator.getNext();
                count++;
            }
            NodeTwoLinked<T> Node = new NodeTwoLinked<>();
            Node.setData(data);
            Node.setPrevious(iterator);
            Node.setNext(iterator.getNext());
            iterator.getNext().setPrevious(Node);
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
            head.setPrevious(null);
            size--;
        }
    }

    public void removeBack(){
        if(isEmpty()){
            System.out.println("List is Empty. Cant remove the element");
        }
        else{
            tail = tail.getPrevious();
            tail.setNext(null);
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
            while(count != position-1){
                iterator = iterator.getNext();
                count++;
            }
            iterator.setNext(iterator.getNext().getNext());
            iterator.getNext().setPrevious(iterator);
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
        return -1;
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
