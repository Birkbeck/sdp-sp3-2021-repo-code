package ch11.sec04;

@ToString(includeName=false)
public class Point {
    @ToString(includeName=false) private int x;
    @ToString(includeName=false) private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}