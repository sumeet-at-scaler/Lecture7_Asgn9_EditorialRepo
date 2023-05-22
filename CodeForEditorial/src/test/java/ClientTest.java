import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.fail;

public class ClientTest {

    @Test
    public void testTypeOfObjectReceivedByFunWithMaps() {
        Client.main(null);
        if(!Client.tester.equals("ConcurrentHashMap") &&
           !Client.tester.equals("Hashtable")){
            fail("Pass an object of thread-safe map to funWithMethods e.g. Hashtable or ConcurrentHashMap");
        }
    }
}
