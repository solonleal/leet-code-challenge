package br.nom.solonleal.leetcodechallenge.waterbottles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaterBottlesTest {
    WaterBottles desafio = new WaterBottles();

    private static List<Arguments> cenariosNumWaterBottles() {
        Arguments cenario1 = Arguments.of(9, 3, 13);
        Arguments cenario2 = Arguments.of(15, 4, 19);

        return Arrays.asList(cenario1, cenario2);
    }

    @MethodSource("cenariosNumWaterBottles")
    @ParameterizedTest(name = "Cenário de Teste - tendo {0} garrafas de água, podendo trocar {1} garrafas vazias por uma cheia, você consegue beber {2} de água")
    void testNumWaterBottles(int qtdGarrafas, int numGarrafasVaziasPorGarrafaCheia, int resultadoEsperado) {
        int retorno = desafio.numWaterBottles(qtdGarrafas, numGarrafasVaziasPorGarrafaCheia);

        assertEquals(resultadoEsperado, retorno);
    }
}