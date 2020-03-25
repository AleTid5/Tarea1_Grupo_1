package Ejercicio1.Game;

import Utils.Messages.Message;

import java.time.temporal.ValueRange;

public abstract class NumberGenerator {
    private static final ValueRange range = ValueRange.of(1, 100);
    private static final Integer randomNumber = (int) (Math.random() * (range.getMaximum() - range.getMinimum()) + range.getMinimum());

    public static void initialize(Boolean showGeneratedNumber) {
        if (showGeneratedNumber) {
            Message.normal("Se ha generado un número aleatorio, intente adivinarlo! (" + NumberGenerator.randomNumber + ")");
        } else {
            Message.normal("Se ha generado un número aleatorio, intente adivinarlo!");
        }
    }

    public static ValueRange getRange() {
        return NumberGenerator.range;
    }

    public static Integer getRandomNumber() {
        return NumberGenerator.randomNumber;
    }
}
