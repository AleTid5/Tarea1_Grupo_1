package Common.Utils;

import Common.Utils.Interfaces.IMessage;

public abstract class Message implements IMessage {
    
    private static Boolean flag = false;

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

    public static void primaryGrey(Object message) {
        if (flag = !flag)
            Message.primary(message);
        else
            Message.grey(message);
    }

    public static void greyBlue(Object message) {
        if (flag = !flag)
            Message.grey(message);
        else
            Message.blue(message);
    }
}
