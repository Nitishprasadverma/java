import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
       Class eagleClass = Eagle.class;

        // System.out.println(eagleClass.getName());

        // System.out.println(Modifier.toString(eagleClass.getModifiers()));
        // System.out.println(eagleClass.getAnnotations());
        // System.out.println(eagleClass.getConstructors());
        // System.out.println(eagleClass.getFields());
        // System.out.println(eagleClass.getMethods());

        Method[] methods = eagleClass.getMethods();

        for(Method method : methods){

            System.out.println("Method name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Class Name :" + method.getDeclaringClass());

            System.out.println("**********");
        }


    }
}
