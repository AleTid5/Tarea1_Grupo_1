package Ejercicio1.Models;

import Ejercicio1.Exceptions.NearException;
import Ejercicio1.Exceptions.RangeException;
import Utils.Messages.Message;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private Integer inputNumber = null;
    private Integer triedTimes = 0;

    public Game() {
        NumberGenerator.initialize();
        this.play();
    }

    private void play() {
        while (!NumberGenerator.getRandomNumber().equals(this.inputNumber)) {
            try {
                this.askForANumber();

                if (! NumberGenerator.getRange().isValidValue(this.inputNumber)) {
                    throw new RangeException(NumberGenerator.getRange().getMinimum(), NumberGenerator.getRange().getMaximum());
                }

                triedTimes++;

                if (this.inputNumber > NumberGenerator.getRandomNumber()) {
                    throw new NearException(true);
                }

                if (this.inputNumber < NumberGenerator.getRandomNumber()) {
                    throw new NearException(false);
                }
            } catch (InputMismatchException e) {
                Message.error("¡Solo puede ingresar números!");
            } catch (NearException e) {
                Message.warning(e.getMessage());
            } catch (Exception e) {
                Message.error(e.getMessage());
            }
        }

        this.gameOver();
    }

    private void askForANumber() {
        Message.grey("Ingrese un número: ");
        this.inputNumber = new Scanner(System.in).nextInt();
    }

    private void gameOver() {
        String message = this.triedTimes > 1 ? "movimientos!" : "movimiento!";

        Message.success("Usted ha ganado el juego en " + this.triedTimes + " " + message);
    }
}
