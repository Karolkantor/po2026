//znalezione na githubie, do przeanalizowania

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {


        Set<Integer> numbers = new HashSet<>();



        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(random.nextInt(49) + 1);

        }
        System.out.println(lottoNumbers);

    }
}