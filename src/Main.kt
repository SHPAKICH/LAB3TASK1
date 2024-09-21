import kotlin.random.Random

fun main() {
    val choices = mapOf(1 to "Камень", 2 to "Ножницы", 3 to "Бумага")

    while (true) {
        // Выбор компьютера (случайное значение от 1 до 3)
        val computerChoice = Random.nextInt(1, 4)
        println("Выберите: 1 - Камень, 2 - Ножницы, 3 - Бумага")

        // Ввод выбора игрока
        val playerChoice = readLine()?.toIntOrNull()

        // Проверка корректности ввода
        if (playerChoice == null || playerChoice !in 1..3) {
            println("Некорректный ввод. Пожалуйста, введите 1, 2 или 3.")
            continue
        }

        // Печать выбора компьютера и игрока
        println("Вы выбрали: ${choices[playerChoice]}")
        println("Компьютер выбрал: ${choices[computerChoice]}")

        // Логика определения победителя
        when {
            playerChoice == computerChoice -> {
                println("Ничья! Попробуйте снова.\n")
            }
            (playerChoice == 1 && computerChoice == 2) ||
                    (playerChoice == 2 && computerChoice == 3) ||
                    (playerChoice == 3 && computerChoice == 1) -> {
                println("Вы победили!\n")
                break
            }
            else -> {
                println("Компьютер победил!\n")
                break
            }
        }
    }
}
