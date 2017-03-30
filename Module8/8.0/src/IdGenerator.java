import java.util.Random;

/**
 Создайте класс-утилиту IdGenerator,
 который будет генерировать и возвращать уникальный идентификатор (реализацию продумайте самостоятельно).
 */

public final class IdGenerator {
    private static Random random = new Random();

    static int generateRandom(int n) {
        return Math.abs(random.nextInt()) % n;
    }
}
