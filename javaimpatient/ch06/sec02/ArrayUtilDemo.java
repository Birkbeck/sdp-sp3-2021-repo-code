package ch06.sec02;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        ArrayUtil.swap(friends, 0, 1);
        
        // Uncomment to see error message
        // Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
    }
}
