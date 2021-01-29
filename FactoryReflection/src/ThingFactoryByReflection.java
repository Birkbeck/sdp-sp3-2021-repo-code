public class ThingFactoryByReflection {
    private static Class aClass;

    private ThingFactoryByReflection() {}

    public static Thing newInstance( String name) {
        if (aClass == null) {
            try {
                aClass = Class.forName(name + "Thing");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e); // or whatever is appropriate
            }
        }

        try {
             return (Thing)aClass.newInstance();
        } catch(InstantiationException e){
            throw new RuntimeException(e); // or whatever is appropriate
        } catch(IllegalAccessException e){
            throw new RuntimeException(e); // or whatever is appropriate
        }
    }
} 