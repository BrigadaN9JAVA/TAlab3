public class NodeTwoLinked<T>{

    private NodeTwoLinked next;
    private NodeTwoLinked previous;
    private T data;

    public NodeTwoLinked() {
        this.next = null;
        this.previous = null;
    }

    public NodeTwoLinked<T> getNext() {
        return next;
    }

    public void setNext(NodeTwoLinked next) {
        this.next = next;
    }

    public NodeTwoLinked<T> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeTwoLinked previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
