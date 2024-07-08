package br.nom.solonleal.leetcodechallenge.findTheWinner;

import java.util.Arrays;

/**
 * Desafio 1823
 * url: <a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/">...</a>
 */
public class FindTheWinner {

    public int findTheWinner(int n, int k) {
        int[] amigos = new int[n];
        int qtdAmigosRestantes = n;
        int amigoAtual = 0;

        Arrays.fill(amigos, 1);

        while(qtdAmigosRestantes > 1) {

            for(int i = 0; i < k; i++) {
                int amigo = amigos[amigoAtual];

                while(amigo == 0) {
                    amigoAtual = (amigoAtual == n - 1) ? 0 : amigoAtual + 1;
                    amigo = amigos[amigoAtual];
                }

                if(i < k - 1) {
                    amigoAtual = (amigoAtual == n - 1) ? 0 : amigoAtual + 1;
                }
            }

            amigos[amigoAtual] = 0;
            amigoAtual = (amigoAtual == n - 1) ? 0 : amigoAtual + 1;
            qtdAmigosRestantes --;
        }

        for(int i = 0; i < n; i++) {
            if(amigos[i] == 1) {
                amigoAtual = i + 1;
                break;
            }
        }

        return amigoAtual;
    }
}
