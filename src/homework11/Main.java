package homework11;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        new Thread(() -> {
            try {
                while (true) {
                    pingPong.ping();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    pingPong.pong();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
