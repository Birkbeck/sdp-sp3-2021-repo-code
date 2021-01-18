package ch03.sec06;

import java.awt.Color;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}