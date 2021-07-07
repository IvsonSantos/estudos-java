package java7.reflection;

import java7.thread.exemplo2.BankAccount;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(123);
        callGetId(acct1);

        callDeposit(acct1, 77);
        System.out.println("Balance: " + acct1.getBalance());;
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

    static void callDeposit(Object obj, int amt) {
        try {
            Class<?> theClass = obj.getClass();
            Method m = theClass.getMethod("deposit", int.class);
            m.invoke(obj, amt);
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
