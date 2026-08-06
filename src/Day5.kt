fun createAccount(
    username: String?,
    password: String?,
    ageInput: String,
    email: String?,
    referralCode: Any?
): String {
    val errors = mutableListOf<String>()
    if (username == null ){ errors.add("Username is null") }
    else if (username.isBlank()) errors.add("Username is blank")

    if (password == null) errors.add("Password must not be null or empty")
    else if (password.isBlank()) errors.add("Password is blank")
    else if (password.length < 8) errors.add("Password must have at least 8 characters")

    if (ageInput.isBlank()) {
        errors.add("User must be at least 18 years old")
    }
    else if(ageInput.toIntOrNull() == null) {
        errors.add("Age must be a number")
    }
    else if (ageInput.toInt()<0){ errors.add("Age must be greater than or equal to 0") }

    if(email.isNullOrBlank()) {
        errors.add("Not updated email")
    }
    else if(email.contains("@")==false) {
        errors.add("Email is not valid")
    }
    val validReferralCode: String? =
        referralCode as? String
    if(referralCode == null){ errors.add("valid with not referral code") }
    if (validReferralCode.isNullOrBlank()) {
        errors.add("Referral code must be a String")
    }

    if(errors.isNotEmpty()) {
        return errors.joinToString (separator = "\n") }
    else{
        return "username: $username\n age: $ageInput\nemail: $email"
    }
}
fun main() {
//    println(
//        createAccount(
//            username = null,
//            password = "123",
//            ageInput = "abc",
//            email = "invalid-email",
//            referralCode = 12345
//        )
//    )
//

    println(
        createAccount(
            username = "Quang",
            password = "12345678",
            ageInput = "21",
            email = "quang@example.com",
            referralCode = "FRIEND2026"
        )
    )
}