package eight.demo07;

public class Consumer extends Thread {
    Tickets t = null;
    int i = 0;

    public Consumer(Tickets t) {
        this.t = t;
    }

    public void run() {
        while (i < t.size) {
            if (t.available == true && i <= t.number) System.out.println("Consumer buys ticket " + (++i));
            if (i == t.number)
                t.available = false;
        }
    }

}
