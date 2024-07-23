package br.nom.solonleal.leetcodechallenge.sortarraybyincreasingfrequency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Desafio 1636
 * url: <a href="https://leetcode.com/problems/sort-array-by-increasing-frequency/description/">...</a>
 */
public class SortArrayByIncreasingFrequency {

    int numerosPreenchidos = 0;

    public int[] frequencySort(int[] nums) {
        Map<Integer, Long> numerosPorFrequencia = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Stream<Map.Entry<Integer, Long>> numerosPorFrequenciaOrdenados = numerosPorFrequencia.entrySet()
                .stream().sorted((o1, o2) -> {
                    if (o1.getValue().compareTo(o2.getValue()) != 0) {
                        return o1.getValue().compareTo(o2.getValue());
                    }

                    return o2.getKey().compareTo(o1.getKey());
        });

        numerosPorFrequenciaOrdenados.forEach(entry -> {
            for (int i = 0; i < entry.getValue().intValue(); i++) {
                nums[numerosPreenchidos++] = entry.getKey();
            }
        });

        return nums;
    }
}
