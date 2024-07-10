package br.nom.solonleal.leetcodechallenge.crawlerlogfolder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrawlerLogFolderTest {
    CrawlerLogFolder desafio = new CrawlerLogFolder();

    private static List<Arguments> cenariosMinOperations() {
        Arguments cenario1 = Arguments.of(new String[] {"d1/","d2/","../","d21/","./"}, 2);
        Arguments cenario2 = Arguments.of(new String[] {"d1/","d2/","./","d3/","../","d31/"}, 3);
        Arguments cenario3 = Arguments.of(new String[] {"d1/","../","../","../"}, 0);

        return Arrays.asList(cenario1, cenario2, cenario3);
    }

    @SuppressWarnings("unused")
    @MethodSource("cenariosMinOperations")
    @ParameterizedTest(name = "Cenário de Teste - após esses comandos {0}, precisamos de {2} operações para voltar para a pasta principal")
    void testMinOperations(String[] logs, int resultadoEsperado) {
        int retorno = desafio.minOperations(logs);

        assertEquals(resultadoEsperado, retorno);
    }
}