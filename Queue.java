public class Queue<T> {
    OneLinkedList<T> list;

    public Queue(){
        list = new OneLinkedList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.getSize();
    }

    public void clear(){
        list.clear();
    }

    public void push(T data){
        list.addBack(data);
    }

    public void first(){
        if(isEmpty()){
            System.out.println("Queue is empty, cant display the element");
        }
        else {
            System.out.println(list.getHead().getData());
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Queue is empty, cant pop the element");
        }
        else {
            System.out.println(list.getHead().getData());
            list.removeFront();
        }
    }
}
