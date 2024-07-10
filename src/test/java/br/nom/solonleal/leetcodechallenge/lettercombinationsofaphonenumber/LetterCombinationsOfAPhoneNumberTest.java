package br.nom.solonleal.leetcodechallenge.lettercombinationsofaphonenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LetterCombinationsOfAPhoneNumberTest {
    LetterCombinationsOfAPhoneNumber desafio = new LetterCombinationsOfAPhoneNumber();

    private static List<Arguments> cenariosLetterCombinations() {
        Arguments cenario1 = Arguments.of("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        Arguments cenario2 = Arguments.of("", Collections.emptyList());
        Arguments cenario3 = Arguments.of("2", List.of("a", "b", "c"));
        return Arrays.asList(cenario1, cenario2, cenario3);
    }

    @MethodSource("cenariosLetterCombinations")
    @ParameterizedTest(name = "Cenário de Teste - com os dígitos \"{0}\", temos essas combinações de letras {1}")
    void testAverageWaitingTime(String digitos, List<String> resultadoEsperado) {
        List<String> retorno = desafio.letterCombinations(digitos);

        assertIterableEquals(resultadoEsperado, retorno);
    }
}