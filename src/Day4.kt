fun getDisplayName(username: String?): String {
    val display = username ?:  "User"
    return "$display"
}

fun getEmailLength(email: String?): Int {
    val emaillength = email?.length ?: 0
    return emaillength
}

fun parseAge(input: String): Int? {
    val result = input.toIntOrNull()
    when{
        result==null -> return null
        result <= 0 -> return null
        else -> return result
    }


}

fun register(
    username: String?,
    password: String?
): String {
    val errors = mutableListOf<String>()
    if ( username == null) {
        errors.add("Username is null")
    } else if (username?.isNotBlank() == true) {
        errors.add("Username isn't blank")
    }
    if (password == null) {
        errors.add("Password is null")
    }
    else if((password?.length ?: 0) < 8) {
        errors.add("Password is must > 8 characters")
    }

    if(errors.isEmpty()){
        return "Account true : $username + $password"
    }
    else{
        return "${errors.joinToString (separator = "\n") }"
    }


}
fun main () {
   val username: String? = "Quang"
    println("Hello " + getDisplayName(username))

println(getEmailLength("quang@gmail.com"))

    println(parseAge("-5"))

println(register(null, "99"))
}