public class TestTime<T> {
    LinkedList<T> list;

    public TestTime(LinkedList<T> list){
        this.list = list;
    }

    public long testAddFront(T data){
        long end;
        long start = System.nanoTime();
        list.addFront(data);
        end = System.nanoTime();
        return end-start;
    }

    public long testAddBack(T data){
        long end;
        long start = System.nanoTime();
        list.addBack(data);
        end = System.nanoTime();
        return end-start;
    }

    public long testInsert(T data, int position){
        long end;
        long start = System.nanoTime();
        list.insert(data, position);
        end = System.nanoTime();
        return end-start;
    }

    public long testRemoveFront(){
        long end;
        long start = System.nanoTime();
        list.removeFront();
        end = System.nanoTime();
        return end-start;
    }

    public long testRemoveBack(){
        long end;
        long start = System.nanoTime();
        list.removeBack();
        end = System.nanoTime();
        return end-start;
    }

    public long testDelete(int position){
        long end;
        long start = System.nanoTime();
        list.delete(position);
        end = System.nanoTime();
        return end-start;
    }

    public long testGetIndex(T data){
        long end;
        long start = System.nanoTime();
        list.getIndex(data);
        end = System.nanoTime();
        return end-start;
    }
}
