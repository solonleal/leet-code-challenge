package br.nom.solonleal.leetcodechallenge.twosum;

import java.util.HashMap;
import java.util.Map;

/*
 * Desafio 1
 * url: <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> items = new HashMap<>();
        int[] retorno = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int valor = nums[i];

            // Existe algum item que completa a soma
            Integer itemCompletaSoma = items.get(target - valor);
            if(itemCompletaSoma != null) {
                // Terminou
                retorno[0] = itemCompletaSoma;
                retorno[1] = i;
            }

            // Caso não tenha item que complete a soma
            items.putIfAbsent(valor, i);
        }

        return retorno;
    }
}
