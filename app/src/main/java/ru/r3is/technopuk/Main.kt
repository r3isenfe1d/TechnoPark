package ru.r3is.technopuk

fun main() {
    println(
        "TaskA --> ${
            taskA(
                arrayOf("Kostya", "Egor", "Albina", "Artur", "Dasha")
            )
        }"
    )
    println(
        "TaskB --> ${
            taskB(
                arrayOf(1, -34, 229, -4, 55, 69, 102, 37, 98, 0, -1)
            )
        }"
    )
    println(
        "TaskC --> ${
            taskC(
                -1,
                mutableMapOf(
                    "Milk" to 24.5,
                    "Apple" to 13.4,
                    "Pear" to 100.0,
                    "Pack" to 0.0
                )
            )
        }"
    )

}

/*
 *  Задача А. Самый длинный на районе
 * Друзья решили устроить мини-соревнования у кого же самое длинное
 * имя на районе. Для этого они хотят написать программу, помоги реализовать
 * им алгоритм - ожидается, что будет выведено самое длинное имя.
 *
 * Input: let names: [String] = ["Kostya", "Egor", "Albina", "Artur", "Dasha"]
 * Output: Albina
 */

fun taskA(names: Array<String>): String {
    return names.maxBy { it.length }
}

/*
 * Задача B. Сын маминой подруги
 * В университете после экзамена студенты решили найти студента с самой большой
 * оценкой за экзамен. Оценка за экзамен находится в диапазоне от 0 до 100.
 * При этом, некоторые студенты указали ложную оценку, например 101, 102 или -4,
 * оценка считается ложной, если она не попадает в разрешенный диапазон.
 * Необходимо найти максимальную НЕложную оценку за экзамен
 * и вывести ее на экран.
 *
 * Input: let array: [Int] = [1, -34, 229, -4, 55, 69, 102, 37, 98, 0, -1]
 * Output: 98
 */

fun taskB(array: Array<Int>): Int {
    return array.filter { it in 0..100 }.max()
}

/*
 * Задача C. Братская скидка
 * В магазине проводят акцию со скидкой на всю продукцию x% и решили заменить
 * ценники на новые. Поэтому кассирам нужно получить упорядоченные по убыванию
 * цены - продукты с их новыми ценами. При этом, если получается цена 0,
 * нужно вывести слово: “Бесплатно”
 *
 * Input: x: 20
 * let items: [String: Double] =
 *      ["Milk": 24.5, "Apple": 13.4, "Pear": 100, "Pack": 0]
 *
 * Output:
 *      Product: Pear, price: 80.0
 *      Product: Milk, price: 19.6
 *      Product: Apple, price: 10.72
 *      Product: Pack, price: Бесплатно
 */

fun taskC(x: Int, items: MutableMap<String, Double>): ArrayList<Product> {
    val products: ArrayList<Product> = arrayListOf()
    items.forEach {
        products.add(
            Product(
                it.key,
                (it.value * (1 - x / 100.0))
            )
        )
    }
    products.sortByDescending { it.price as? Comparable<Any> }
    products.forEach { if (it.price == 0.0) it.price = "Бесплатно" }
    return products
}

fun foo(items: List<*>) {}
fun bar(items: List<Any>) {}

fun baz(items: ArrayList<*>) {}
fun fofo(items: Array<Any>) {}
