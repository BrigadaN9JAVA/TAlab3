public interface LinkedList<T> {
    public int getSize();
    public boolean isEmpty();
    public void addFront(T data);
    public void addBack(T data);
    public void insert(T data, int position);
    public void removeFront();
    public void removeBack();
    public void delete(int position);
    public int getIndex(T data);
    public void display();
    public void clear();
}
