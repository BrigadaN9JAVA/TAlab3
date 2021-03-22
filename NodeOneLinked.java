public class NodeOneLinked<T> {
    private NodeOneLinked<T> next;
    private T data;

    public NodeOneLinked() {
        this.next = null;
    }

    public NodeOneLinked<T> getNext() {
        return next;
    }

    public void setNext(NodeOneLinked next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
