import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Людмила on 27.03.2017.
 */
public class Generate {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        ArrayList<String> listString = new ArrayList<String>();
        LinkedList<Integer> linkedInt = new LinkedList<Integer>();
        LinkedList<String> linkedString = new LinkedList<String>();

        System.out.println("getTimeForAdd1000");
        System.out.println(getTimeForAdd(listInt, 1000));
        System.out.println(getTimeForAdd(listString, 1000));
        System.out.println(getTimeForAdd(linkedInt, 1000));
        System.out.println(getTimeForAdd(linkedString, 1000));

        System.out.println("getTimeForGet1000");
        System.out.println(getTimeForGet(listInt, 1000));
        System.out.println(getTimeForGet(listString, 1000));
        System.out.println(getTimeForGet(linkedInt, 1000));
        System.out.println(getTimeForGet(linkedString, 1000));

        System.out.println("getTimeForSet1000");
        System.out.println(getTimeForSet(listInt, 1000));
        System.out.println(getTimeForSet(listString, 1000));
        System.out.println(getTimeForSet(linkedInt, 1000));
        System.out.println(getTimeForSet(linkedString, 1000));

        System.out.println("getTimeForRemove1000");
        System.out.println(getTimeForRemove(listInt, 1000));
        System.out.println(getTimeForRemove(listString, 1000));
        System.out.println(getTimeForRemove(linkedInt, 1000));
        System.out.println(getTimeForRemove(linkedString, 1000));

        System.out.println("getTimeForAdd10000");
        System.out.println(getTimeForAdd(listInt, 10000));
        System.out.println(getTimeForAdd(listString, 10000));
        System.out.println(getTimeForAdd(linkedInt, 10000));
        System.out.println(getTimeForAdd(linkedString, 10000));

        System.out.println("getTimeForGet10000");
        System.out.println(getTimeForGet(listInt, 10000));
        System.out.println(getTimeForGet(listString, 10000));
        System.out.println(getTimeForGet(linkedInt, 10000));
        System.out.println(getTimeForGet(linkedString, 10000));

        System.out.println("getTimeForSet10000");
        System.out.println(getTimeForSet(listInt, 10000));
        System.out.println(getTimeForSet(listString, 10000));
        System.out.println(getTimeForSet(linkedInt, 10000));
        System.out.println(getTimeForSet(linkedString, 10000));

        System.out.println("getTimeForRemove10000");
        System.out.println(getTimeForRemove(listInt, 10000));
        System.out.println(getTimeForRemove(listString, 10000));
        System.out.println(getTimeForRemove(linkedInt, 10000));
        System.out.println(getTimeForRemove(linkedString, 10000));
    }

    public static long getTimeForAdd(List list, int x) {
        long currentTime = System.nanoTime();
        for (long i = 0; i < x; i++) {
            list.add(i);
        }
        return System.nanoTime() - currentTime;
    }

    public static long getTimeForGet(List list, int x) {
        long currentTime = System.nanoTime();
        for (long i = 0; i < x; i++) {
            list.get((int) i);
        }
        return System.nanoTime() - currentTime;
    }

    public static long getTimeForSet(List list, int x) {
        long currentTime = System.nanoTime();
        for (long i = 0; i < x; i++) {
            list.set((int) i, "hlkjk");
        }
        return System.nanoTime() - currentTime;
    }

    public static long getTimeForRemove(List list, int x) {
        long currentTime = System.nanoTime();
        for (long i = x - 1; i >= 0; i--) {
            list.remove(i);
        }
        return System.nanoTime() - currentTime;
    }
}


