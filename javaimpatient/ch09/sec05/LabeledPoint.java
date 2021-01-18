package ch09.sec05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.geometry.Point2D;

public class LabeledPoint implements Serializable {
    private String label;
    private transient Point2D point;
    
    public LabeledPoint(String label, Point2D point) {
        this.label = label;
        this.point = point;
    }
    
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s[label=%s,point=%s]", getClass().getName(), label, point);
    }
    
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeDouble(point.getX());
        out.writeDouble(point.getY());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        double x = in.readDouble();
        double y = in.readDouble();
        point = new Point2D(x, y);
    }    
}
