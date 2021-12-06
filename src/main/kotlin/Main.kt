fun main(args: Array<String>) {
    var finalCost: Int
    val sum = 3000
    var price = 650
    val discount = 100
    var regularUser = true

    println("Сумма предидуших покупок $sum руб.")
    println("Стоимость покупки $price руб.")

    finalCost =
        if (sum < 1000) price else if (sum >= 1001 && sum <= 10000) price - discount else price - (price / 100 * 5)
    if (regularUser == true) finalCost -= (finalCost / 100)


    println("Стоимость со скидкой $finalCost руб.")
}