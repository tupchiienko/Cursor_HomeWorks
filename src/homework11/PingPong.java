package homework11;

public class PingPong {
    private boolean flag;

    public synchronized void ping() throws InterruptedException {
        while (flag) {
            wait();
        }
        flag = true;
        notifyAll();
        System.out.println("Ping");
        Thread.sleep(500);
    }

    public synchronized void pong() throws InterruptedException {
        while (!flag) {
            wait();
        }
        flag = false;
        notifyAll();
        System.out.println("Pong");
        Thread.sleep(500);
    }
}
