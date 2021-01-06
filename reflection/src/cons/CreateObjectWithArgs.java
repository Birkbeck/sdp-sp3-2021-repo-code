package cons;

import java.lang.reflect.Constructor;

// Create an instance of a class with given arguments
// No error checking but this is just an example

public class CreateObjectWithArgs {
    public static void main(String[] args) {
        Class c;
        try {
            // Hard wired class name and arguments
            String aclass = "cons.Simple";
            Object[] splitArgs = {"a", "b", 3, "d"};

            // load the class file
            c = Class.forName(aclass);

            // get all the constructors
            var cons = c.getConstructors();

            Constructor con = null;

            // get the required constructor with the appropriate number of parameters
            for (var item : cons) {
                if (item.getParameterTypes().length == splitArgs.length) {
                    con = item;
                }
            }

            // OR

            // get the required constructor with the appropriate parameter types
            /*
            Class[] argTypes = new Class[splitArgs.length];
            for (int index=0; index < splitArgs.length; index++){
                argTypes[index] = splitArgs[index].getClass();
            }

            con = c.getDeclaredConstructor(argTypes);
            */

            // check the parameter types
            for (Class cl : con.getParameterTypes()) {
                System.out.println(cl);
            }

            // now create the instance
            Object o = con.newInstance(splitArgs);

            // print out the object to make sure it was created
            System.out.println(o);

            // should be more specific about the exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

