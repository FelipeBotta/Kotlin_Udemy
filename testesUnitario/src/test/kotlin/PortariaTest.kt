import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest {

    val negadoMenoresDeIdade = "Negado. Menor de Idade !"
    val conviteInvalido = "Negado. Convite inválido !"
    val welcome = "Welcome !"


    @Test
    @DisplayName("Negar Entrada de Menores de Idade")
    fun validaMenoresDeIdade() {
        val str = portaria(15,"","")
        Assertions.assertEquals(negadoMenoresDeIdade,str)
    }

    @Test
    @DisplayName("Negar entrada para tipo de convite inválido !")
    fun validaTipoDeConvite(){
        val str = portaria(25,"adasdas","")
        Assertions.assertEquals(conviteInvalido,str)

    }

    @Test
    @DisplayName("Negar entrada para convite comum com código inválido.")
    fun validaConviteValidoCodigoInvalidoComum(){
        val str = portaria(25, "comun","xx66468")
        Assertions.assertEquals(conviteInvalido,str)

    }

    @Test
    @DisplayName("Negar entrada para convite luxo com código inválido.")
    fun validaConviteValidoCodigoInvalidoLuxo(){
        val str = portaria(25, "luxo","xx66468")
        Assertions.assertEquals(conviteInvalido,str)

    }

    @Test
    @DisplayName("Negar entrada para convite premium com código inválido.")
    fun validaConviteValidoCodigoInvalidoPremium(){
        val str = portaria(25, "premium","xx66468")
        Assertions.assertEquals(conviteInvalido,str)

    }

    @Test
    @DisplayName("Permitir entrada para convite comum com código válido.")
    fun validaConviteValidoCodigoComun(){
        val str = portaria(25,"comum","xt1854258")
        Assertions.assertEquals(welcome,str)

    }

    @Test
    @DisplayName("Permitir entrada para convite premium com código válido.")
    fun validaConviteValidoCodigoPremium(){
        val str = portaria(25,"premium","xl1854258")
        Assertions.assertEquals(welcome,str)

    }

    @Test
    @DisplayName("Permitir entrada para convite luxo com código válido.")
    fun validaConviteValidoCodigoLuxo(){
        val str = portaria(25,"luxo","xl1854258")
        Assertions.assertEquals(welcome,str)

    }

    @Test
    fun validaConviteValidoSemCodigoComum(){
        val str = portaria(25,"comum","")
        Assertions.assertEquals(conviteInvalido,str)
    }



}