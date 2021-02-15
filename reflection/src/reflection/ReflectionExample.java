package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
  public static void main(String[] args) {

    // Obtain the class object if we know the name of the class
    Class type = RentCar.class;
    try {
      // get the absolute name of the class
//      String typeClassPackage = type.getName();
//      System.out.println("Class Name is: " + typeClassPackage);
//
//      // get the simple name of the class (without package info)
//      String typeClassWithoutPackage = type.getSimpleName();
//      System.out.println("Class Name without package is: " + typeClassWithoutPackage);
//
//      // get the package name of the class
//      Package typePackage = type.getPackage();
//      System.out.println("Package Name is: " + typePackage);
//
//      // get all the constructors of the class
//      for (Constructor c : type.getConstructors()) {
//        System.out.println("Constructor: " + c);
//      }
//
      // get constructor with specific argument
      Constructor constructor = type.getConstructor(Integer.TYPE);
      System.out.println(constructor);

      // initializing an object of the RentCar class
      RentCar rent = (RentCar) constructor.newInstance(455);
      // RentCar rent = new RentCar(455);
      System.out.println(rent);

//      // get all methods of the class including declared methods of superclasses
//      // in that case, superclass of RentCar is the class java.lang.Object
//      for (Method method : type.getMethods()) {
//        System.out.println("method = " + method.getName());
//      }
//      System.out.println();

//      // get all methods declared in the class but excludes inherited methods.
//      for (Method dmethod : type.getDeclaredMethods()) {
//        System.out.println("method = " + dmethod.getName());
//      }
//      System.out.println();

      // get method with specific name and parameters
//      Method oneMethod = type.getMethod("computeRentalCost", Integer.TYPE);
//      System.out.println("Method is: " + oneMethod);
//
//      // call computeRentalCost method with parameter int
//      oneMethod.invoke(rent, 4);
//      // rent.computeRentalCost(4)
//
//      // get all the parameters of computeRentalCost
//      Class[] parameterTypes = oneMethod.getParameterTypes();
//      System.out.println("Parameter types of computeRentalCost() are: " + Arrays.toString(parameterTypes));
//
//      // get the return type of computeRentalCost
//      System.out.println("Return type is: " + oneMethod.getReturnType());

      // gets all the public member fields of the class RentCar
      System.out.println("Public Fields are: ");
      for (Field oneField : type.getFields()) {
        // get public field name
        Field field = type.getField(oneField.getName());
        System.out.println("Fieldname is: " + field.getName());

        // get public field type
        System.out.println("Type of field " + field.getName() + " is: " + field.getType());

        // get public field value
        Object value = field.get(rent);
        System.out.println("Value of field " + field.getName() + " is: " + value);
      }

      // How to access private member fields of the class

      // getDeclaredField() returns the private field
      Field privateField = RentCar.class.getDeclaredField("type");

      System.out.println("One private Field name is: " + privateField.getName());
      // makes this private field instance accessible
      // for reflection use only, not normal code
      privateField.setAccessible(true);

      // get the value of this private field
      System.out.println("fieldValue = " + privateField.get(rent));

    } catch (NoSuchMethodException | IllegalArgumentException | NoSuchFieldException |
      InvocationTargetException | IllegalAccessException | InstantiationException e) {
      e.printStackTrace();
    }
  }
}