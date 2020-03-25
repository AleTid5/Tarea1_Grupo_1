package Utils.Helpers;

public abstract class Message {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void blue(Object message) {
        System.out.println(BLUE + message + RESET);
    }

    public static void error(Object message) {
        System.out.println(RED + message + RESET);
    }

    public static void grey(Object message) {
        System.out.println(WHITE + message + RESET);
    }

    public static void normal(Object message) {
        System.out.println(message);
    }

    public static void primary(Object message) {
        System.out.println(CYAN + message + RESET);
    }

    public static void purple(Object message) {
        System.out.println(PURPLE + message + RESET);
    }

    public static void success(Object message) {
        System.out.println(GREEN + message + RESET);
    }

    public static void warning(Object message) {
        System.out.println(YELLOW + message + RESET);
    }
}
