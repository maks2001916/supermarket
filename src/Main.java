public class Main {
    public static void main(String[] args) {
        Supermarket kassa1 = new Supermarket();
        kassa1.addPersonQueue1("посетитель 1");
        kassa1.addPersonQueue1("посетитель 2");
        kassa1.addPersonQueue1("посетитель 3");
        kassa1.addPersonQueue2("посетитель 1");
        kassa1.addPersonQueue2("посетитель 2");
        kassa1.addPersonQueue2("посетитель 3");
        kassa1.addPersonQueue2("посетитель 4");
        kassa1.optimality("посетитель х");
    }
}