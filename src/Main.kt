fun main() {
   val name = "Quang"
   val age = 22
   var  studyHours = 0
   studyHours += 6
   val level = when{
       studyHours >= 6 -> "Very Good"
       studyHours >= 3 -> "Good"
       else -> "Bad, You should spend more time for Kotlin "
   }
    println("Level: $level")
    val introduction = if( age >= 21){
        "you are old enough, $age years old"
    } else {
        "so bad, you are not enough 18 years old"
    }
    println("Introduction: $introduction")
    println("Todat's study time : $studyHours")
    println("Level of completion: $level")
    for (day in 7 downTo 1 step 2) {
        println("Day $day of learning Kotlin")
    }
    val languages = listOf("Java", "Kotlin", "SQL")

    for (language in languages) {
        println(language)
    }
}