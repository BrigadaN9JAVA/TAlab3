public class Stack<T> {

    OneLinkedList<T> list;

    public Stack(){
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
        list.addFront(data);
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cant pop the element");
        }
        else {
            System.out.println(list.getHead().getData());
            list.removeFront();
        }
    }

    public void top() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cant display the element");
        } else{
            System.out.println(list.getHead().getData());
        }
    }

}
