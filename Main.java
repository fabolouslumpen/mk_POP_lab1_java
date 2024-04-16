public class Main {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        int[] workTimes = {5, 3, 2, 4, 6};

        Counter[] counters = new Counter[numberOfThreads];
        Breaker breaker = new Breaker(counters, workTimes);
        breaker.start();
    }
}
