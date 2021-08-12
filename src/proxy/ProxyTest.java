package proxy;

import javax.swing.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {
    public static void main(String[] args) {
        Object[] elementsOfObject = new Object[1000];
        for (int i = 0; i < elementsOfObject.length; i++) {
            Integer value = i + 1;
            TraceHolder handler = new TraceHolder(value);
            Object proxy = Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[]{Comparable.class}, handler);
            elementsOfObject[i] = proxy;
        }
        Integer key = new Random().nextInt(
                elementsOfObject.length + 1);
        int result = Arrays.binarySearch(elementsOfObject, key);
        if (result >= 0)
            System.out.println(elementsOfObject[result]);
    }
}

class TraceHolder implements InvocationHandler {
    private Object target;

    public TraceHolder(Object t) {
        target = t;
    }

    public Object invoke(Object proxy, Method m, Object[] args)
            throws Throwable {
        System.out.println(target);
        System.out.println(". " + m.getName() + " (");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                if (i < args.length - 1)
                    System.out.println(", ");
            }
        }
        System.out.println(" )");
        return m.invoke(target, args);
    }

}