package ru.r3is.technopuk

data class Product(
    var name: String,
    var price: Any,
) {
    override fun toString(): String {
        return "Product: $name, price: $price"
    }
}