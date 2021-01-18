package ch10.sec07;

public class Queue {
    class Node { Object value; Node next; };
    private Node head;
    private Node tail;

    public synchronized void add(Object newValue) {
        Node n = new Node();
        if (head == null) head = n; 
        else tail.next = n;
        tail = n;
        tail.value = newValue;
        notifyAll();
    }

    public synchronized Object remove() {
        if (head == null) return null;
        Node n = head;
        head = n.next;
        return n.value;
    }
    
    public synchronized Object take() throws InterruptedException {
        while (head == null) wait();
        Node n = head;
        head = n.next;
        return n.value;
    }    
}