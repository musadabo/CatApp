fun main() {
    val flathead = Cat(name = "Flathead", age = 7, weight = 10)
    val cupra = Cat(name = "Cupra", age = 2, weight = 7)

    flathead.eat(3) // Passes 3 as the amount to eat
    flathead.eat(4) // Passes 4 as the amount to eat
    println(flathead)

    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(cupra)
}