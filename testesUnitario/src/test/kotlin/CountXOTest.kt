import org.junit.jupiter.api.*
import java.lang.IndexOutOfBoundsException

class CountXOTest {

    @Test
    @DisplayName("Testa a qtd de x e o.")
    fun textCountXO() {

        Assertions.assertAll({
            Assertions.assertTrue(countXO("xoxo"))
        }, {
            Assertions.assertFalse(countXO("xxo"))
        }, {
            Assertions.assertFalse(countXO("xxo"))
        })

    }

    @Test
    @Disabled
    fun naoImplementada() {
        // corpo do teste
    }

    @Test
    fun vaiFalhar() {
        fail(message = "vai falhar")
    }

    @Test
    fun rodaBaseadoEmCondicao() {
        Assumptions.assumeTrue(countXO("xxoo"))

        Assertions.assertEquals(true,countXO("xo"))
    }

    @Test
    fun lancaExecao(){
        assertThrows<IndexOutOfBoundsException> {
            abc()
        }
    }

    @Test
    fun testeNotNull(){
        Assertions.assertNotNull(countXO("fsdfsdf"))
    }

}
