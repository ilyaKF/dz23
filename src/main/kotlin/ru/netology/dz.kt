package ru.netology

fun main() {
    val fixDiscount = 100
    val maxDiscount = 5
    val discontForMusicLover = 1
    val monthlyBuyer: Boolean = true
    val price = 2_000
    var resultPrice = 0
    if (price <= 1_000) {
        resultPrice = price
    } else if (price > 1_000 && price <= 10_000) {
        resultPrice = price - fixDiscount
    } else {
        resultPrice = price - price * (maxDiscount / 100)
    }
    if (monthlyBuyer) resultPrice = price - price * (discontForMusicLover / 100)
    println(resultPrice)
}