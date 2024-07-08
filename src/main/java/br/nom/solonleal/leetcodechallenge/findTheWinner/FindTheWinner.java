package br.nom.solonleal.leetcodechallenge.findTheWinner;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Desafio 1823
 * url: <a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/">...</a>
 */
public class FindTheWinner {

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(queue.size() > 1) {
            for(int j = 0; j < k - 1; j++) {
                queue.add(queue.poll());
            }
            queue.remove();
        }

        return queue.peek();
    }
}
