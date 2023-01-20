fun main() {
    println("Введите сумму покупок")
    val discountAmountOneThousand = 1000
    val discountAmountTenThousand = 10000
    val amount: Int = readLine()!!.toInt()
    var discount = 0.0
    if (amount < discountAmountOneThousand) {
        0.0
    } else if (amount < discountAmountTenThousand) {
        discount = 100.0
    } else {
        discount = 0.05 * amount
    }
    println("Являетесь нашим постоянным покупателем(true/false).")
    val statusOfCustomer: Boolean = readLine()!!.toBoolean()
    val extraDiscount: Double = if (statusOfCustomer) (amount - discount) * 0.01 else 0.0
    println("Цена со скидкой будет ${amount - discount - extraDiscount} рублей")
}

