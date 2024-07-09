package br.nom.solonleal.leetcodechallenge.waterbottles;

/*
 * Desafio 1518
 * url: <a href="https://leetcode.com/problems/water-bottles/description/">...</a>
 */
public class WaterBottles {

    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles < numExchange) {
            return numBottles;
        }

        int quantidadeGarrafasVaziasTrocadas = numBottles / numExchange;
        int quantidadeGarrafasRestantes = numBottles % numExchange;
        int proximaInteracao = quantidadeGarrafasVaziasTrocadas + quantidadeGarrafasRestantes;

        return numWaterBottles(proximaInteracao, numExchange) + numBottles - quantidadeGarrafasRestantes;
    }
}
