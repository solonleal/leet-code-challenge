package br.nom.solonleal.leetcodechallenge.reverseparentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseParenthesesTest {
    ReverseParentheses desafio = new ReverseParentheses();

    private static List<Arguments> cenariosReverseParentheses() {
        Arguments cenario1 = Arguments.of("(abcd)", "dcba");
        Arguments cenario2 = Arguments.of("(u(love)i)", "iloveu");
        Arguments cenario3 = Arguments.of("(ed(et(oc))el)", "leetcode");
        return Arrays.asList(cenario1, cenario2, cenario3);
    }

    @MethodSource("cenariosReverseParentheses")
    @ParameterizedTest(name = "Cenário de Teste - a sequência de letras e conchetes \"{0}\" após a inversão do conteúdo interno de cada colchetes tem como resultado \"{1}\"")
    void testReverseParentheses(String entrada, String resultadoEsperado) {
        String retorno = desafio.reverseParentheses(entrada);

        assertEquals(resultadoEsperado, retorno);
    }
}