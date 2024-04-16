public class Breaker extends Thread {
    private Counter[] counters;
    private int[] workTimes;

    public Breaker(Counter[] counters, int[] workTimes) {
        this.counters = counters;
        this.workTimes = workTimes;
    }

    public void run() {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = new Counter(3, i + 1, workTimes[i]);
            counters[i].start();
        }
    }
}
