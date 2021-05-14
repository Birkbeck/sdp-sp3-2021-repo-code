package adt;

// Sum type
sealed interface Shape permits Circle, Rectangle {
}
// Product type
record Point(float x, float y) {
}

final record Circle(Point center, int radius) implements Shape {
}

final record Rectangle(Point lowerLeft, Point upperRight) implements Shape {
}