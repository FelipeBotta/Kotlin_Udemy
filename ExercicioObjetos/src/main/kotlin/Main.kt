import character.*
import utils.CharacterOptions
import kotlin.concurrent.thread

fun main() {

    // Escolha do personagem hero
    val hero: Character = chooseHero()

    // Cria o inimigo
    val enemy = createEnemy()

    // Inicia a batalha
    Battle.start(hero, enemy)

    // Sistema de jogo - Executa até que acabe a batalha
    thread {
        while (hero.isAlive() && enemy.isAlive()) {
            Battle.fight()
            Thread.sleep(2500)
        }
    }
}

private fun createEnemy() = Goblin(100, 18, 5)

private fun getUserInputForCharacter(): CharacterOptions {
    var character: String

    do {
        println("Escolha seu personagem: ")
        println("Arqueiro (A)")
        println("Mago (M)")
        print("Sua escolha: ")
        character = readlnOrNull()?.trim().toString().lowercase()
    } while (character !in listOf("a", "m"))

    if (character == "a") {
        return CharacterOptions.Archer
    } else {
        return CharacterOptions.Wizard
    }
}

private fun chooseHero(): Character {

    val character = getUserInputForCharacter()

    return if (character == CharacterOptions.Archer) {
        return Archer(100, 15, 10)
    } else {
        return Wizard(100, 15, 10)
    }

}