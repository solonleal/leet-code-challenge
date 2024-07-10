package br.nom.solonleal.leetcodechallenge.crawlerlogfolder;

/**
 * Desafio 1598
 * url: <a href="https://leetcode.com/problems/crawler-log-folder/description/">...</a>
 */
public class CrawlerLogFolder {
    private static final String PATH_ANTERIOR = "../";
    private static final String PATH_ATUAL = "./";

    public int minOperations(String[] logs) {
        int profundidade = 0;

        for(String log : logs) {
            if(PATH_ANTERIOR.equals(log)) {
                profundidade = profundidade == 0 ? 0 : profundidade - 1;
            } else if(!PATH_ATUAL.equals(log)) {
                profundidade++;
            }
        }

        return profundidade;
    }
}
