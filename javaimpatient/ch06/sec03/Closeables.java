package ch06.sec03;

import java.util.ArrayList;

public class Closeables {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        for (T elem : elems) elem.close();
    }
}