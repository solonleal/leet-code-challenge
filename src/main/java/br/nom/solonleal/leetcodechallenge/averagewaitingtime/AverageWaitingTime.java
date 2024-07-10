package br.nom.solonleal.leetcodechallenge.averagewaitingtime;

/**
 * Desafio 1701
 * url: <a href="https://leetcode.com/problems/average-waiting-time/description/">...</a>
 */
public class AverageWaitingTime {

    public double averageWaitingTime(int[][] customers) {
        double tempoEspera = 0;
        int tempoAtual = 1;

        for(int[] cliente : customers) {
            int momentoInicioPreparacaoPrato = cliente[0];
            int tempoPreparo = cliente[1];

            if(momentoInicioPreparacaoPrato > tempoAtual) {
                tempoAtual = momentoInicioPreparacaoPrato;
            } else if(momentoInicioPreparacaoPrato < tempoAtual){
                tempoEspera += tempoAtual - momentoInicioPreparacaoPrato;
            }

            tempoEspera += tempoPreparo;
            tempoAtual += tempoPreparo;
        }

        return tempoEspera / customers.length;
    }
}
