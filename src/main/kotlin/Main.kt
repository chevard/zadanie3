import java.util.Scanner
fun main(args: Array<String>) {
    println("Введите сумму покупки")
    val scanner = Scanner(System. `in`)
    val pokupka = scanner.nextDouble()
    var result = 0.0
    if(pokupka <= 1000){
        println("Скидки нет")
    }
    else if(1001<pokupka && pokupka<=10000){
        result = pokupka - 100
        println("Ваша покупка с учетом скидки = " + result)
    }
    else if (pokupka > 10001){
        result = pokupka - (pokupka * 0.05)
        println("Ваша покупка с учетом скидки = " + result)
    }
    println("Введите true или false, чтобы узнать, являетесь ли вы постоянным покупателем")
    var pokup = scanner.nextBoolean()
    var skidka = 0.01
    var newResult = 0.0
    if(pokup == true){
      newResult = result+skidka
        println("Вы постоянный покупатель, вам ещё скидка 1%. Итого: " + newResult)
    }
    else {
        println("Вы не постоянный покупатель, конечная сумма покупки = " + result)
    }
}