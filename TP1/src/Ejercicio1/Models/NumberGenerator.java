package Ejercicio1.Models;

import Utils.Helpers.Message;

import java.time.temporal.ValueRange;

public abstract class NumberGenerator {
    private static final ValueRange range = ValueRange.of(1, 100);
    private static final Integer randomNumber = (int) (Math.random() * (range.getMaximum() - range.getMinimum()) + range.getMinimum());

    public static void initialize() {
        NumberGenerator.initialize(false);
    }

    public static void initialize(Boolean showGeneratedNumber) {
        if (showGeneratedNumber) {
            Message.blue(String.format("Se ha generado un número aleatorio, intente adivinarlo! (%s)",
                    NumberGenerator.randomNumber));
        } else {
            Message.blue("Se ha generado un número aleatorio, intente adivinarlo!");
        }
    }

    public static ValueRange getRange() {
        return NumberGenerator.range;
    }

    public static Integer getRandomNumber() {
        return NumberGenerator.randomNumber;
    }
}
