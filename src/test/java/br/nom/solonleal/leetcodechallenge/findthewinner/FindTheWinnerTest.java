package br.nom.solonleal.leetcodechallenge.findthewinner;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheWinnerTest {
    FindTheWinner desafio = new FindTheWinner();

    private static List<Arguments> cenariosFindTheWinner() {
        Arguments cenario1 = Arguments.of(5, 2, 3);
        Arguments cenario2 = Arguments.of(6, 5, 1);

        return Arrays.asList(cenario1, cenario2);
    }

    @SuppressWarnings("unused")
    @MethodSource("cenariosFindTheWinner")
    @ParameterizedTest(name = "Cenário de Teste - {0} amigos em círculos eliminando de {1} em {1}, o vencedor é o {2}")
    void testFindTheWinner(int qtdFriends, int jump, int resultadoEsperado) {
        int retorno = desafio.findTheWinner(qtdFriends, jump);

        assertEquals(resultadoEsperado, retorno);
    }
}