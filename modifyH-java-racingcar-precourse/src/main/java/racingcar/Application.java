package main.java.racingcar;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String num = "2.31";
        System.out.println(Integer.parseInt(num));
        RacingGame racingGame = new RacingGame();
        racingGame.startRacingGame();
    }
}

