package java7.reflection;

import java7.thread.exemplo2.BankAccount;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(123);
        callGetId(acct1);
    }

    static void callGetId(Object obj) {
        try {
            Class<?> theClass = obj.getClass();
            Method m = theClass.getMethod("getBalance");
            Object result = m.invoke(obj);
            System.out.println("Result: " + result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
