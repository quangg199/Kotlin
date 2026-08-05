//fun add(a: Double, b: Double) = a + b
//fun subtract(a: Double, b: Double) = a-b
//fun multiply(a: Double, b: Double) = a * b
//fun divide(a: Double, b: Double): Unit{
//    if (b != 0.0){ println("${a/b}") }
//    else { println ("Lỗi vì mẫu là số 0") }
//}
///////////////////////////////////////////
//
//fun calculateOrder(
//    price : Double,
//    quantity: Int,
//    discountPercent : Double
//): Double{
//    if(discountPercent != 0.0){
//    return (price * quantity) * discountPercent}
//    else { return price * quantity }
//}



//fun validateAccount(
//    username: String,
//    password: String
//): String {
//
//    return when{
//        username.isEmpty() -> " username can't be empty"
//        password.length < 8 -> " The password must have at least 8 digits."
//        else -> "valid account"
//    }
//}

//fun sum(vararg numbers: Int): Int {
//    var total = 0
//
//    for (number in numbers) {
//        total += number
//    }
//
//    return total
//}

fun hasEnoughBalance(balance: Int, amount: Int): Boolean{
    return balance >= amount
}

fun calculateRemainingBalance(balance: Int, amount: Int): Int{
    if (hasEnoughBalance(balance, amount)){
        return balance - amount
    }
    return balance
}

fun withdraw(
    balance: Int,
    amount: Int,
    fee: Int = 0
): String{

    if (hasEnoughBalance(balance, amount)){
        return " Remaining Balance: ${balance - (amount+fee) }"
    }
    return " There isn't enough money in the account "
}
fun main() {
//    println( "example 1" )
//    println("Chọn phép tính phù hợp")
//    println("1 : phép cộng")
//    println("2 : phép trừ")
//    println("3 : phép nhân")
//    println("4 : phép chia")
//    val number = readln().toInt()
//    println("Nhập a và b ")
//    val a = readln().toDouble()
//    val b = readln().toDouble()
//    val resultPoint = when(number){
//        1 -> add(a, b)
//        2 -> subtract(a, b)
//        3 -> multiply(a, b)
//        4 -> divide(a, b)
//        else -> println("Vui lòng chọn đúng phép tính")
//    }
//    if(number == 4 ){
//        resultPoint
//    }else{
//        println(resultPoint)
//    }

//    println("example 2 ")
//    val a = readln().toDouble()
//    val b = readln().toInt()
//    val c = readln().toDouble()
//    println(" Total Amount : " + calculateOrder(a,b,c) )

//println( "example 3 ")
//    println( validateAccount(username =  "Quang", password = "12345678") )



//
//        // Truyền trực tiếp nhiều số
//        val result1 = sum(1, 2, 3)
//
//        // Truyền một IntArray bằng spread operator *
//        val values = intArrayOf(10, 20, 30)
//        val result2 = sum(*values)
//
//        println("Kết quả 1: $result1")
//        println("Kết quả 2: $result2")

val result  = withdraw(100, 10, 50)
println(result)
}