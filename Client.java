public class Client {
    public static void main(String[] args) {
        TestTime<Integer> tm = new TestTime<>(new OneLinkedList<Integer>());
        long time =0;
        for (int i = 0; i < 1000; i++) {
            time +=tm.testAddBack((int) (Math.random()*20001) - 10000);
        }
        System.out.println("AddBack (OneLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm.testAddFront((int) (Math.random()*20001) - 10000);
        }
        System.out.println("AddFront (OneLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm.testInsert((int) (Math.random()*20001) - 10000, 1000);
        }
        System.out.println("Insert (OneLinked) Test => " + time/1000 + " ns");


        time = 0;
        tm.testInsert(20000, 1500);
        for (int i = 0; i < 1000; i++) {
            time +=tm.testGetIndex(20000);
        }
        System.out.println("GetIndex (OneLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm.testDelete(1500);
        }
        System.out.println("Delete (OneLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm.testRemoveBack();
        }
        System.out.println("RemoveBack (OneLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm.testRemoveFront();
        }
        System.out.println("RemoveFront (OneLinked) Test => " + time/1000 + " ns");


        System.out.println("=================================================================");
        TestTime<Integer> tm2 = new TestTime<>(new TwoLinkedList<Integer>());
        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testAddBack((int) (Math.random()*20001) - 10000);
        }
        System.out.println("AddBack (TwoLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testAddFront((int) (Math.random()*20001) - 10000);
        }
        System.out.println("AddFront (TwoLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testInsert((int) (Math.random()*20001) - 10000, 1000);
        }
        System.out.println("Insert (TwoLinked) Test => " + time/1000 + " ns");


        time = 0;
        tm2.testInsert(20000, 1500);
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testGetIndex(20000);
        }
        System.out.println("GetIndex (TwoLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testDelete(1500);
        }
        System.out.println("Delete (TwoLinked) Test => " + time/1000 + " ns");

        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testRemoveBack();
        }
        System.out.println("RemoveBack (TwoLinked) Test => " + time/1000 + " ns");


        time = 0;
        for (int i = 0; i < 1000; i++) {
            time +=tm2.testRemoveFront();
        }
        System.out.println("RemoveFront (TwoLinked) Test => " + time/1000 + " ns");
    }
}
