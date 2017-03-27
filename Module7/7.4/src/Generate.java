import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Людмила on 27.03.2017.
 */
public class Generate {
    public static void main(String[] args) {
        Integer[] array = new Integer[10000];

        System.out.println(getTimeForAdd10000(new ArrayList()));
        System.out.println(getTimeForAdd10000(new LinkedList()));
        System.out.println(getTimeForAdd1000(new LinkedList()));
    }

    public static long getTimeForAdd10000(List list) {
        long currentTime = new Date().getTime();
        add10000(list);
        get10000(list);

        return new Date().getTime() - currentTime;
    }

    public static void add10000(List list) {
        for (long i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, "is the best");
        }
    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
    }


    public static long getTimeForAdd1000(List list) {
        long currentTime = new Date().getTime();
        add1000(list);
        return new Date().getTime() - currentTime;
    }

    public static void add1000(List list) {
        for (long i = 0; i < 1000; i++) {
            list.add(0, new Object());
        }
    }

}
