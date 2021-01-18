package ch06.sec07;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericReflectionDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        TypeVariable<Class<ArrayList>>[] vars = ArrayList.class.getTypeParameters();
        String name = vars[0].getName(); // "E"
        System.out.println(name);
        
        Method m = Collections.class.getMethod("sort", List.class);
        TypeVariable<Method>[] vars2 = m.getTypeParameters();
        name = vars2[0].getName(); // "T"
        System.out.println(name);

        Type[] bounds = vars2[0].getBounds();
        if (bounds[0] instanceof ParameterizedType) { // Comparable<? super T>
            ParameterizedType p = (ParameterizedType) bounds[0];
            Type[] typeArguments = p.getActualTypeArguments();
            if (typeArguments[0] instanceof WildcardType) { // ? super T
                WildcardType t = (WildcardType) typeArguments[0];
                Type[] upper = t.getUpperBounds(); // ? extends ... & ...
                Type[] lower = t.getLowerBounds(); // ? super ... & ...
                if (lower.length > 0) {        
                    String description = lower[0].getTypeName(); // "T"
                    System.out.println(description);
                }
            }
        }
    }
}
