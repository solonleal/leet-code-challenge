package br.nom.solonleal.leetcodechallenge.sortarraybyincreasingfrequency;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayByIncreasingFrequencyTest {
    SortArrayByIncreasingFrequency desafio = new SortArrayByIncreasingFrequency();

    private static List<Arguments> cenariosSortArrayByIncreasingFrequency() {
        Arguments cenario1 = Arguments.of(new int[] {1,1,2,2,2,3}, new int[]{3,1,1,2,2,2});
        Arguments cenario2 = Arguments.of(new int[] {2,3,1,3,2}, new int[]{1,3,3,2,2});
        Arguments cenario3 = Arguments.of(new int[] {-1,1,-6,4,5,-6,1,4,1}, new int[]{5,-1,4,4,-6,-6,1,1,1});
        return Arrays.asList(cenario1, cenario2, cenario3);
    }

    @MethodSource("cenariosSortArrayByIncreasingFrequency")
    @ParameterizedTest(name = "Cenário de Teste - entrada {0} -> resultado {1}")
    void testSortArrayByIncreasingFrequency(int[] numeros, int[] resultadoEsperado) {
        int[] retorno = desafio.frequencySort(numeros);

        assertArrayEquals(resultadoEsperado, retorno);
    }
}