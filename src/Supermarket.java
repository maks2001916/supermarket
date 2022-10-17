import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Supermarket {
    private String persons;
    private String name;
    private Queue<String> queue = new ArrayDeque<>(5);
    private Queue<String> queue1 = new ArrayDeque<>(5);

    public void addPersonQueue1(String person) {
        queue.offer(person);
    }

    public void addPersonQueue2(String person) {
        queue1.offer(person);
    }

    public void optimality(String name) {
        if (queue.size() == 5 && queue1.size() == 5) {
            System.out.println("Позвать Галю!");
        }
        if (queue.size() < queue1.size()) {
            queue.offer(name);
        } else {
            queue1.offer(name);
        }
    }

    public void deletPerson() {
        int r = 1;
        if (generateRandomInt(r) == 1) {
            queue.poll();
        } else {
            queue1.poll();
        }
    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

}
