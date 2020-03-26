package Utils.Helpers;

import java.util.stream.IntStream;

public abstract class Console {
    public static void clear() {
        IntStream.range(1, 5).forEach(i -> Message.normal("\f"));
    }

    public static void successMessage() {
        Message.normal("\f");
        Message.success("-----------------------------------------");
        Message.success("---- ¡PRODUCTO CARGADO EXITOSAMENTE! ----");
        Message.success("-----------------------------------------");
        Message.normal("\f");
    }
}
