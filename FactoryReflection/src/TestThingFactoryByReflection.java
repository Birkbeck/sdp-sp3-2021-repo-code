import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestThingFactoryByReflection {

    @Test
    public void testThing(){
        Thing obj = ThingFactoryByReflection.newInstance("Metal");
        assertEquals(obj.getClass().toString(), "class MetalThing");
    }

    @Test(expected=RuntimeException.class)
    public void testWrongThing(){
        Thing obj = ThingFactoryByReflection.newInstance("Paper");
    }
}
