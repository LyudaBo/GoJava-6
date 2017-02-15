import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        Course a = new Course(date, "Ivan");
        Course b = new Course("Olya", 20, "Raisa");
        Course c = new Course(date, "Sveta");
        Course d = new Course(date, "Sveta");
        Course[] e = {c, d};

        Student k = new Student("Oleg", "Ivanov", 3);
        Student l = new Student("Petrov", e);

        CollegeStudent m = new CollegeStudent("Alla", "Nor", 2);
        CollegeStudent n = new CollegeStudent("Bro", e);
        CollegeStudent o = new CollegeStudent("Ivo", e, "Tanya", 12, 123456);

        SpecialStudent p = new SpecialStudent("Rut", "Kut", 1);
        SpecialStudent r = new SpecialStudent("Buk", e, "Irina", 5, 7653789);
        SpecialStudent s = new SpecialStudent("Inna", "Tuz", 1, 245789);

        System.out.println(p);
        System.out.println(d);

    }


}
