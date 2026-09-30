fun main() {
    val flathead = Cat(name = "Flathead", age = 7, weight = 10)
    val cupra = Cat(name = "Cupra", age = 2, weight = 7)

    flathead.eat()
    flathead.eat()
    println(flathead)

    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(cupra)
}