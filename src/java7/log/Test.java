package java7.log;

import java.util.logging.*;

public class Test {

    static Logger log = Logger.getLogger("com.teste");

    public static void main(String[] args) {
        Handler h = new ConsoleHandler();
        Formatter f = new SimpleFormatter();

        h.setFormatter(f);
        log.addHandler(h);
        log.setLevel(Level.INFO);
        log.log(Level.INFO, "Loggando...");
    }
}
