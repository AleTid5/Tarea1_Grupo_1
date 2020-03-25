package Utils.Helpers;

public abstract class Console {
    public static void clear() {
        try {
            final String command = java.lang.System.getProperty("os.name").contains("Windows") ? "cls" : "clear all";

            Runtime.getRuntime().exec(command);
        }
        catch (Exception e) {
            Message.normal(e.getMessage());
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception ignored) {}
    }
}
