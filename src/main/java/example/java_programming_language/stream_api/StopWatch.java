package example.java_programming_language.stream_api;

/**
 * Created by 이영호 on 2017-04-03.
 */
public class StopWatch {
    private long start;
    private long end;

    public StopWatch() {
        start = 0;
        end = 0;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    private static long getSystemCurrentTimeMilis() {
        //return System.currentTimeMillis();
        return System.nanoTime();
    }

    public void start() {
        this.start = getSystemCurrentTimeMilis();
    }

    public void end() {
        this.end = getSystemCurrentTimeMilis();
    }

    public long calcResult() {
        return this.end - this.start;
    }

    public void printResult() {
        System.out.println("elapsed time : " + this.calcResult() + " ns");
    }

    public void measure(Measurable measurable) {
        this.start();
        measurable.execute();
        this.end();
        this.printResult();
    }
}
