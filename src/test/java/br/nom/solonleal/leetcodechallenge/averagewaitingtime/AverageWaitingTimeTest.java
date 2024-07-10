package br.nom.solonleal.leetcodechallenge.averagewaitingtime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageWaitingTimeTest {
    AverageWaitingTime desafio = new AverageWaitingTime();

    private static List<Arguments> cenariosAverageWaitingTime() {
        Arguments cenario1 = Arguments.of(new int[][] {{1,2},{2,5},{4,3}}, 5.00000);
        Arguments cenario2 = Arguments.of(new int[][] {{5,2},{5,4},{10,3},{20,1}}, 3.25000);
        return Arrays.asList(cenario1, cenario2);
    }

    @MethodSource("cenariosAverageWaitingTime")
    @ParameterizedTest(name = "Cenário de Teste - após os pedidos {0}, o tempo médio de espera por cliente foi de {1}")
    void testAverageWaitingTime(int[][] clientes, double resultadoEsperado) {
        double retorno = desafio.averageWaitingTime(clientes);

        assertEquals(resultadoEsperado, retorno);
    }

}