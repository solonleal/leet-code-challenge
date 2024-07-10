package br.nom.solonleal.leetcodechallenge.ispalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPalindromeTest {
    IsPalindrome desafio = new IsPalindrome();

    private static List<Arguments> cenariosIsPalindrome() {
        Arguments cenario1 = Arguments.of(121, true);
        Arguments cenario2 = Arguments.of(-121, false);
        Arguments cenario3 = Arguments.of(10, false);
        Arguments cenario4 = Arguments.of(1003003021, false);
        Arguments cenario5 = Arguments.of(1003003001, true);
        Arguments cenario6 = Arguments.of(0, true);

        return Arrays.asList(cenario1, cenario2, cenario3, cenario4, cenario5, cenario6);
    }

    @MethodSource("cenariosIsPalindrome")
    @ParameterizedTest(name = "Cenário de Teste - o número {0} é palindrome ({1})")
    void testIsPallindrome(int numero, boolean resultadoEsperado) {
        boolean retorno = desafio.isPalindrome(numero);

        if(resultadoEsperado) {
            assertTrue(retorno);
        } else {
            assertFalse(retorno);
        }
    }
}