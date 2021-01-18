package ch05.sec01;

public class ThrowDemo {
    public static int randInt(int low, int high) {
        if (low > high)
            throw new IllegalArgumentException(
                "low should be <= high but low is "
                + low + " and high is " + high);

        return low + (int)(Math.random() * (high - low + 1));
    }
    
    public static void main(String[] args) {
        System.out.println("Generating a random number...");
        int r = randInt(10, 20);
        System.out.println("r = " + r);
        System.out.println("And another...");
        r = randInt(10, 5);
        System.out.println("r = " + r);
    }
}
