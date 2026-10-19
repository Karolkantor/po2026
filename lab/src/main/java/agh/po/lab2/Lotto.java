package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;

public class Lotto {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Podaj 6 liczb jako argumenty wywołania programu");
            return;
        }

        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            typy.add(parseInt(args[i]));
        }

        Random random = new Random();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(49) + 1;
            if (!lottoNumbers.contains(number)) {
                lottoNumbers.add(number);
            }
        }

//         zad2
//        System.out.println("Twoje typy: " + typy);
//        System.out.println("Wylosowane liczby: " + lottoNumbers);

//        int trafienia = 0;
//        for (int typ : typy) {
//            if (lottoNumbers.contains(typ)) {
//                trafienia++;
//            }
//        }
//
//        System.out.println("Liczba trafień: " + trafienia);

        long startTime = System.currentTimeMillis();
        long draws = 0;
        int currentHits = 0;

        while (currentHits < 6) {
            draws++;
            currentHits = 0;

            ArrayList<Integer> currentDraw = new ArrayList<>();
            while (currentDraw.size() < 6) {
                int number = random.nextInt(49) + 1;
                if (!currentDraw.contains(number)) {
                    currentDraw.add(number);
                }
            }

            for (int typ : typy) {
                if (currentDraw.contains(typ)) {
                    currentHits++;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Liczba losowań potrzebnych do pełnego trafienia: " + draws);
        System.out.println("Łączny czas działania programu: " + duration + " ms");
    }
}