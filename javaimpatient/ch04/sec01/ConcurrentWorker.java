package ch04.sec01;

public class ConcurrentWorker extends Worker {
    public void work() { 
        Thread t = new Thread(super::work);
        t.start();
    }
}