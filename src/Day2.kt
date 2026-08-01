fun main() {
    val name = "NGUYEN DUC QUANG"
    val age = 21
     println( "My name is $name and I'm $age years old. I'm learning Kotlin for job hunting purposes." )
    println("Input number")
    var point = readln().toInt()
    val result = if(point >=5){
        "Good"
    }else{
        "false"
    }
    println(result)
    println(" Input Day")
    val day = readln().toInt()
    val resultDay = when(day){
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        8 -> "Sunday"
        else -> "Unknown"
    }
    println(resultDay)
    println("End ")
}