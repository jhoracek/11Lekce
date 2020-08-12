import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetAttributesL12Ukol1 {


    public static void main(String[] args) throws IllegalAccessException {

        Person p = new Person("cokoli");

        Field[] fields = Person.class.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                System.out.println(field.getName() + " : " + field.get(p));
            }
        }
    }
}