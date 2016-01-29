package nikolll77.com;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> cls = Container.class;
        Object objOfCls=cls.newInstance();
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            if (m.isAnnotationPresent(ASaver.class)) {
                ASaveTo aSaveto = cls.getAnnotation(ASaveTo.class);
                m.invoke(objOfCls, aSaveto.path());
            }
        }
    }
}
