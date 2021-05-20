package bridge.shapes;

class Shape {
  Colour c; // provides the "link" (bridge) to the other hierarchy using composition
}

class Square extends Shape {}
class Rectangle extends Shape {}
class Triangle extends Shape {}

// add colour to shapes
//class GreenSquare extends Shape {}

class Colour{}

class Red extends Colour {}
class Blue extends Colour {}
class Green extends Colour {}