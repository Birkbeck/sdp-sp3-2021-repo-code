package ch09.sec05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.geometry.Point2D;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Paths.get("employees.ser");
        try (ObjectOutputStream out = new ObjectOutputStream(
                Files.newOutputStream(path))) {
            Employee peter = new Employee("Fred", 90000);
            Employee paul = new Manager("Barney", 105000);
            Manager mary = new Manager("Mary", 180000);
            peter.setBoss(mary);
            paul.setBoss(mary);
            out.writeObject(peter);
            out.writeObject(paul);
            
            out.writeObject(new LabeledPoint("origin", new Point2D(0, 0)));
            
            out.writeObject(PersonDatabase.INSTANCE.findById(1));
        }
        try (ObjectInputStream in = new ObjectInputStream(
                Files.newInputStream(path))) {
            Employee e1 = (Employee) in.readObject();
            Employee e2 = (Employee) in.readObject();
            System.out.println(e1);
            System.out.println(e2);
            
            System.out.println(in.readObject());
            System.out.println(in.readObject());
        }
    }
}
