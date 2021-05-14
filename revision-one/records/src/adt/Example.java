package adt;

sealed interface Shape permits Circle, Rectangle {
}

record Point(float x, float y) {
}

record Circle(Point center, int radius) implements Shape {
}

record Rectangle(Point lowerLeft, Point upperRight) implements Shape {
}