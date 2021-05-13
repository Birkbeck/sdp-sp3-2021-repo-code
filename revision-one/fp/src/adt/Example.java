package adt;

final record Point(float x, float y){}

sealed interface Shape permits Circle, Rectangle {
}


final record Circle(Point center, int radius) implements Shape {
}

final record Rectangle(Point lowerLeft, Point upperRight) implements Shape {
}