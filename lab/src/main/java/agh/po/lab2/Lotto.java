package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;


public class Lotto {
    public static void main(String[] args) {
//        ArrayList<Integer> typy = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            typy.add(parseInt(args[i]));
//        }


        Random random = new Random();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        while (lottoNumbers.size() < 6) {
            int number = (random.nextInt(49) + 1);
            if (!lottoNumbers.contains(number)){
                lottoNumbers.add(number);
            }
        }

        System.out.println("Twoje liczby:" + typy );
        System.out.println("Wylosowane liczby:" + lottoNumbers);
    }
}