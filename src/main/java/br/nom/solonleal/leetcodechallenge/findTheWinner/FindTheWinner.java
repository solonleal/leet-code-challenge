package br.nom.solonleal.leetcodechallenge.findTheWinner;

/**
 * Desafio 1823
 * url: <a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/">...</a>
 */
public class FindTheWinner {

    public int findTheWinner(int n, int k) {
        int vencedor = 0;
        for (int i = 1; i <= n; i++) {
            vencedor = (vencedor + k) % i;
        }
        return vencedor + 1;
    }
}
