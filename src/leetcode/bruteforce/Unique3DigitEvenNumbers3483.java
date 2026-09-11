package leetcode.bruteforce;

import java.util.HashSet;
import java.util.Set;

    public class Unique3DigitEvenNumbers3483{

//        public static int totalNumbers(int[] digits) {
//            int[] freq = new int[10];
//
//            for (int digit : digits) {
//                freq[digit]++;
//            }
//
//            int count = 0;
//
//            for (int hundreds = 1; hundreds <= 9; hundreds++) {
//                if (freq[hundreds] == 0) {
//                    continue;
//                }
//
//                freq[hundreds]--;
//
//                for (int tens = 0; tens <= 9; tens++) {
//                    if (freq[tens] == 0) {
//                        continue;
//                    }
//
//                    freq[tens]--;
//
//                    for (int units = 0; units <= 8; units += 2) {
//                        if (freq[units] > 0) {
//                            count++;
//                        }
//                    }
//
//                    freq[tens]++;
//                }
//
//                freq[hundreds]++;
//            }
//
//            return count;
//        }
        public static int totalNumbers(int[] digits) {
            Set<Integer> numbers = new HashSet<>();

            for (int i = 0; i < digits.length; i++) {
                for (int j = 0; j < digits.length; j++) {
                    for (int k = 0; k < digits.length; k++) {

                        if (i == j || i == k || j == k) {
                            continue;
                        }

                        if (digits[i] == 0) {
                            continue;
                        }

                        if (digits[k] % 2 != 0) {
                            continue;
                        }

                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];

                        numbers.add(number);
                    }
                }
            }

            return numbers.size();
        }

        public static void main(String[] args) {
            int[] digits = {6, 6, 6};
            System.out.println(totalNumbers(digits));
        }
    }