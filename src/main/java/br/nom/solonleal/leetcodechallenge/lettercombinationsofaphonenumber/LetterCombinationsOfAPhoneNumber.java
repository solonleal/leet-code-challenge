package br.nom.solonleal.leetcodechallenge.lettercombinationsofaphonenumber;

import java.util.*;

/**
 * Desafio 17
 * url: <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/">...</a>
 */
public class LetterCombinationsOfAPhoneNumber {

        public List<String> letterCombinations(String digits) {
            if(digits.isEmpty()) {
                return Collections.emptyList();
            }

            Map<Character, List<String>> keys = carregarMap();

            char[] charArray = digits.toCharArray();
            List<String> respostas = new ArrayList<>(keys.get(charArray[0]));

            for(int i = 1; i < charArray.length; i++) {
                List<String> opts = keys.get(charArray[i]);
                List<String> respostasAux = new ArrayList<>();

                for(String resposta : respostas) {
                    for(String opt : opts) {
                        respostasAux.add(resposta.concat(opt));
                    }
                }
                respostas.clear();
                respostas.addAll(respostasAux);
            }

            return respostas;
        }

    private Map<Character, List<String>> carregarMap() {
        return Map.of('2', Arrays.asList("a","b", "c"),
                '3', Arrays.asList("d","e", "f"),
                '4', Arrays.asList("g","h", "i"),
                '5', Arrays.asList("j","k", "l"),
                '6', Arrays.asList("m","n", "o"),
                '7', Arrays.asList("p","q", "r", "s"),
                '8', Arrays.asList("t","u", "v"),
                '9', Arrays.asList("w","x", "y", "z"));
    }
}