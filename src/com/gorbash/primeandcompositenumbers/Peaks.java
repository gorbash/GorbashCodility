package com.gorbash.primeandcompositenumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by Gorbash on 2014-12-30.
 * Implementation of Codility Peaks problem
 */
public class Peaks {
    public int solution(int[] A) {
        List<Integer> listOfPeaks = peaks(A);

        if (listOfPeaks.size() == 0) {
            return 0;
        }
        if (listOfPeaks.size() == 1) {
            return 1;
        }
        List<Integer> div = divisors(A.length);

        List<Integer> list = div.stream().filter(x -> x <= listOfPeaks.size()).collect(Collectors.toList());
        list.remove(list.size() - 1);

        for (int countOfRanges : list) {
            if (listOfPeaks.size() < countOfRanges) {
                continue;
            }
            if (!checkPeakInRange(countOfRanges, A.length, listOfPeaks)) {
                continue;
            }
            return countOfRanges;
        }
        return 1;
    }

    private boolean checkPeakInRange(int countOfRanges, int totalSize, List<Integer> peaks) {
        int rangeSize = totalSize / countOfRanges;
        boolean[] rangesCovered = new boolean[countOfRanges];
        for (Integer peak : peaks) {
            int coveredRange = peak / rangeSize;
            rangesCovered[coveredRange] = true;
        }
        for (boolean coveredRange : rangesCovered) {
            if (!coveredRange)
                return false;
        }
        return true;
    }

    List<Integer> divisors(int number) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                ret.add(i);
                int second = number / i;
                if (second != i)
                    ret.add(second);
            }
        }
        Collections.sort(ret);
        Collections.reverse(ret);
        return ret;
    }

    List<Integer> peaks(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        if (A.length > 2) {
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
