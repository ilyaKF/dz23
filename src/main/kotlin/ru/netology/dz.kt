package ru.netology

fun main() {
    val fixDiscount = 100
    val maxDiscount:Double = 5.00
    val discontForMusicLover:Double = 1.00
    val monthlyBuyer: Boolean = true
    val price = 2_000_000
    var resultPrice = 0
    if (price <= 1_000) {
        resultPrice = price
    } else if (price > 1_000 && price <= 10_000) {
        resultPrice = price - fixDiscount
    } else {
        resultPrice = (price - price * (maxDiscount / 100)).toInt()
    }
    if (monthlyBuyer) resultPrice -= (resultPrice * (discontForMusicLover / 100)).toInt()
    println("Итоговая сумма: ${resultPrice}")
}