import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BancoTest{

    val negadoTamanhoInvalido = "Conta Inválida !"
    val negadoDigitoInvalido = "Digito Inválido !"
    val tenteNovamente = "Tente Novamente !"
    val acessoCPF = "Bem vindo à sua Conta Física"
    val acessoCNPJ = "Bem vindo à sua Conta Corporativa"


    @Test
    fun validaTamanho(){
        val str = banco("12345","","")
        Assertions.assertEquals(negadoTamanhoInvalido,str)
    }

    @Test
    fun validaDigitoInvalido(){
        val str = banco("123456","1","")
        Assertions.assertEquals(negadoDigitoInvalido,str)
    }

    @Test
    fun validaContaCPF(){
        val str = banco("123456","21","Fisica")
        Assertions.assertEquals(acessoCPF,str)
    }

    @Test
    fun validaContCNPJ(){
        val str = banco("123456","123","Corporativa")
        Assertions.assertEquals(acessoCNPJ,str)
    }

    @Test
    fun validaTenteNovamente(){
        val str = banco("123456","123","Fisica")
        Assertions.assertEquals(tenteNovamente,str)
    }

}