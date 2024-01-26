package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Factors {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int minOfB = b.stream().mapToInt(x -> x).min().orElse(0);
        if(minOfB == 0) {
            System.out.println("Min of B returned 0");
            return 0;
        }

        List<Integer> factorsOfB = findFactors(minOfB);
        System.out.println(factorsOfB);

        int count = 0;

        // test each factor to see if all els in a are factors
        // and make sure that factor is a factor of all other els in b
        for (Integer factor : factorsOfB) {
            boolean isFactorForA = true;
            for (Integer aVal : a) {
                if(factor % aVal != 0) {
                    isFactorForA = false;
                    break;
                }
            }

            // now test that factor
            if(isFactorForA) {
                boolean isFactorForB = true;
                for (Integer bVal : b) {
                    if(bVal % factor != 0) {
                        isFactorForB = false;
                        break;
                    }
                }
                if(isFactorForB) {
                    count++;
                }
            }
        }

        return count;

    }

    private static List<Integer> findFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1);
        List<Integer> b = List.of(100);

        System.out.println(getTotalX(a, b));
    }
}
