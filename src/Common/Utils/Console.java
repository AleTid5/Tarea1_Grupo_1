package Common.Utils;

import java.util.stream.IntStream;

public abstract class Console {
    public static void clear() {
        IntStream.range(1, 5).forEach(i -> Message.show("\f"));
    }

    public static void successMessage() {
        Message.show("\f");
        Message.show("-----------------------------------------");
        Message.show("---- ¡PRODUCTO CARGADO EXITOSAMENTE! ----");
        Message.show("-----------------------------------------");
        Message.show("\f");
    }
}
