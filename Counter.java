public class Counter extends Thread {
    private int step;
    private volatile boolean running = true;
    private int id;
    private int workTime;

    public Counter(int step, int id, int workTime) {
        this.step = step;
        this.id = id;
        this.workTime = workTime;
    }

    public void run() {
        long sum = 0;
        long steps = 0;
        long endTime = System.currentTimeMillis() + workTime * 1000;
        while (System.currentTimeMillis() < endTime) {
            sum += step;
            steps++;
        }
        System.out.println("Counter " + id + ": Sum = " + sum + ", Steps = " + steps);
    }

    public void stopCounter() {
        running = false;
    }
}
