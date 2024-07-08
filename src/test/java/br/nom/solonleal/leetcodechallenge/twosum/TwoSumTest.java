package br.nom.solonleal.leetcodechallenge.twosum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    TwoSum desafio = new TwoSum();

    public static List<Arguments> cenariosTwoSum() {
        Arguments cenario1 = Arguments.of("Opções [2,7,11,15] gerando soma 9", new int[]{2,7,11,15}, 9, new int[]{0,1});
        Arguments cenario2 = Arguments.of("Opções [3,2,4] gerando soma 6", new int[]{3,2,4}, 6, new int[]{1,2});
        Arguments cenario3 = Arguments.of("Opções [3,3] gerando soma 6", new int[]{3,3}, 6, new int[]{0,1});

        return Arrays.asList(cenario1, cenario2, cenario3);
    }

    @SuppressWarnings("unused")
    @MethodSource("cenariosTwoSum")
    @ParameterizedTest(name = "Cenário de Teste - {0}")
    void testTwoSum(String cenario, int[] numeros, int valorObjetivo, int[] resultadoEsperado) {
        int[] retorno = desafio.twoSum(numeros, valorObjetivo);

        assertArrayEquals(resultadoEsperado, retorno);
    }
}