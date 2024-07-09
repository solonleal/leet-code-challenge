package br.nom.solonleal.leetcodechallenge.ispalindrome;

import java.util.ArrayList;
import java.util.List;

/*
 * Desafio 9
 * url: <a href="https://leetcode.com/problems/palindrome-number/description/">...</a>
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if(x <= 0) {
            return x == 0;
        }

        List<Integer> algarismos = new ArrayList<>();
        while(x > 0) {
            algarismos.add(x % 10);
            x /= 10;
        }

        for(int i = 0; i < algarismos.size() / 2; i++) {
            if(!algarismos.get(i).equals(algarismos.get(algarismos.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
