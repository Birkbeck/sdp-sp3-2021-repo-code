package ch11.sec01;

import java.util.NoSuchElementException;

public class ReceiverDemo {
    
    static class Sequence {
        private int from;
        private int to;
        public Sequence(int from, int to) {
            this.from = from;
            this.to = to;
        }
        
        class Iterator implements java.util.Iterator<Integer> {
            private int current;
            
            public Iterator(ReceiverDemo.Sequence Sequence.this) {
                this.current = Sequence.this.from;
            }
            
            @Override
            public boolean hasNext() {
                return current < to;
            }
            
            @Override
            public Integer next() {
                if (current >= to) throw new NoSuchElementException();
                Integer result = current;
                current++;
                return result;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }
    }
    
    public static void main(String[] args) {
        Sequence seq = new Sequence(0, 10);
        java.util.Iterator<Integer> iter = seq.new Iterator();
        while (iter.hasNext()) System.out.println(iter.next());
    }

}
