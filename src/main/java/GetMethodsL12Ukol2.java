import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethodsL12Ukol2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Person c = new Person("sdfd");

        // Using getDeclareMethod() method
        Method m = Person.class
                .getDeclaredMethod("privMethod1");

        // Using setAccessible() method
        m.setAccessible(true);

        // Using invoke() method
        m.invoke(c);

    }
}
