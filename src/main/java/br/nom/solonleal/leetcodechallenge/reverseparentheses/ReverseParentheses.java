package br.nom.solonleal.leetcodechallenge.reverseparentheses;

/**
 * Desafio 1190
 * url: <a href="https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/">...</a>
 */
public class ReverseParentheses {

    public String reverseParentheses(String s) {
        int[][] indicesEmAberto = new int[s.length()][2];
        int[][] indicesFechados = new int[s.length()][2];
        int contadorEmAberto = 0;
        int contadorFechados = 0;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if(character == '(') {
                indicesEmAberto[contadorEmAberto++][0] = i;
            } else if(character == ')') {
                int inicio = indicesEmAberto[--contadorEmAberto][0];

                if(i - inicio < 3) {
                    continue;
                }

                indicesFechados[contadorFechados][0] = inicio;
                indicesFechados[contadorFechados++][1] = i;
            }
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < contadorFechados; i++) {
            int inicio = indicesFechados[i][0];
            int fim = indicesFechados[i][1];

            String trecho = sb.substring(inicio, fim+1);
            String trechoTratado = new StringBuilder(trecho).reverse().toString();
            sb.replace(inicio, fim+1, trechoTratado);
        }

        String retorno = sb.toString();
        retorno = retorno.replace("(","");
        retorno = retorno.replace(")","");

        return retorno;
    }
}
