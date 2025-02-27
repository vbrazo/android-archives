/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * There can also hold annotations:
 * @param arguments - string arguments passed through the console.
 * */
fun main(arguments: Array<String>) {
  var myAge: Int = 23
  val name: String = "Filip"
  val lastName = "Babic"
  val weight = 63.5
  var isProgrammingAwesome = true

  println(name)

  println("I am $myAge years old")
  myAge += 1 // adds 1 to myAge
  println("I am $myAge years old")

  println("$name $lastName is $myAge years old, and weighs $weight kg")

  val fullName = "$lastName, $name"
  println(fullName)

  // converting types
  val ageAsString = myAge.toString()
  println(ageAsString)
  val ageFromString = "35".toInt()
  println(ageFromString)

  val nameLength = fullName.length
  println(nameLength)

  println("Is programming awesome? $isProgrammingAwesome")

  val isLegalDrivingAge: Boolean = myAge >= 18
  println("Can I drive? $isLegalDrivingAge")

  var ageTim = 27
  val isTimOlder: Boolean = ageTim > myAge
  println("is Tim older than me? $isTimOlder")

  // Single line comment, useful for marking sections
  // You can also split them in mutliple lines

  /* This is a multiline comment.
     You don't have to add // before
     each line.

     /*
       You can also nest multiline comments.
     */
   */

  var strangerName = "Tim"
  var myName = "Filip"

  val isSameName: Boolean = strangerName == myName
  println(isSameName)

  val areNamesDifferent: Boolean = myName != strangerName
  println("strangerName == myName => $areNamesDifferent")

  val negative = !areNamesDifferent
  println("!areNamesDifferent => $negative")

  val firstObject = Any()
  val secondObject = Any()

  // check if they point to the same address in memory
  println(firstObject === secondObject)

  // negate reference
  println(firstObject === secondObject)

  // Booleans
  val isNameEmpty: Boolean = myName.isEmpty()
  println(isNameEmpty)

  val myPassword = "1234567890"
  val isPasswordSecure: Boolean = myPassword.length >= 10
  println(isPasswordSecure)

  val areSameLengths: Boolean = myName.length == strangerName.length
  println(areSameLengths)

  //  Combine Logical Operators => &&, ||
  var country = "USA"
  val isUnderAge: Boolean = (myAge <= 18 && country == "Coatria") || (country == "USA" && myAge >= 16)

  if (isUnderAge) {
    println("is my Age less than 18? Do I live in the USA? $isUnderAge")
  } else {
    println("is my Age less than 18? Do I live in the USA? $isUnderAge")
  }

  if (myAge >= 18) println("I'm an adult") else println("I'm still underage!")

  val ageMessage: String = if (myAge >= 18) "I'm adult" else "I'm still underage!"
  println(ageMessage)

  println(if (myAge >= 18) "I'm adult" else "I'm still underage!")

  if (myAge >= 18) {
    val country = "Croatia"

    if (country == "USA") {
      println("You're not allowed to drive, but not to drink!")
    } else if (country == "Croatia") {
      println("You're allowed to both drink and drive (not at the same time)!")
    } else {
      println("You can't drive or drink")
    }
  }

  val yearOfBirth = 1996

  val generationCohort: String = if (yearOfBirth > 1964 && yearOfBirth < 1980) {
    "Generation X"
  } else if (yearOfBirth > 1979 && yearOfBirth < 1995) {
    "Millenial"
  } else {
    "Generation 2"
  }

  println(generationCohort)

  // Challenge: if expressions & Boolean logic
  val email: String = "vbrazo@gmail.com"
  val username: String = "vbrazo"
  val password: String = "1234567890"

  if (email.isNotEmpty() && username.isNotEmpty() && password.isNotEmpty()) {
    if ((username.length >= 6 && password.length >= 10) && email.contains("@") || email.contains(".")) {
      println("Email is valid")
    } else {
      println("Email isn't valid")
    }
  } else {
    println("One of the properties is empty")
  }

  // Create and Consume Nullables
  val nickname: String? = null

  if (nickname != null) {
    println(nickname?.length)
  } else {
    println("Nickname is null")
  }

  var otherNickName : String? = "nickname"

  // requireNotNull lets you check if the variable is null without an if statement
  var notNullNickname : String = requireNotNull(otherNickName)
  println(notNullNickname.length)

  // Elvis operator ?:
  // if the value is not null, it returns the left hand side, otherwise it returns the right hand side
  val myNickname : String = nickname ?: myName
  println(myNickname)

  val lastBirthdayYear = 2019
  val myAgeNotNull : Int = myAge ?: return

  val myYearOfBirth : Int = lastBirthdayYear - myAgeNotNull
  println("I was born in $myYearOfBirth")

  // Challenge: Nullables
  val newPassword : String? = "1234567890"
  val newPasswordLength : Int = newPassword?.length ?: 0

  if (newPassword != null && newPassword.isNotEmpty()) {
    if (newPasswordLength in 1..5) {
      println("Weak password. Try again!")
    } else if (newPasswordLength > 10) {
      println("No one is getting through this!")
    } else {
      println("Ironclad")
    }
  } else {
    println("You need a password to keep safe!")
  }

  // Challenge: last challenge
  val myFirstName = "Vitor"
  val myLastName = "Oliveira"
  val mySecretNickname = "vbrazo"
  val myCountry = "Brazil"
  val age = 33

  val nameToPrint : String = if (age >= 18) "$myFirstName, " else ""
  val nicknameToPrint : String = mySecretNickname ?: ""
  val birthYear : Int = 2020 - age

  println("$nameToPrint $nicknameToPrint $myLastName, born on $birthYear, in $myCountry")
  
  // Triples and Pairs
  val creditCard = Triple(123123232323, 274, "Visa")
  val bankAccount = Pair(creditCard, 10)

  println(creditCard.first)
  println(creditCard.second)
  println(creditCard.third)

  println(bankAccount.first)
  println(bankAccount.second)

  val (creditCardInfo, balance) = bankAccount

  println(balance)
  println(creditCardInfo.first)
  println(creditCardInfo.second)
  println(creditCardInfo.third)
  
  // Arrays
  // has fixed size
  // single chunck of memory
  // you don't have the ability to add or remove elements after creating the array
  val visitedCountries = arrayOf<String>(
      "Brazil", "Japan", "Canada", "USA", "Spain"
  )

  println(visitedCountries)
  println(visitedCountries.size)
  println(visitedCountries[0])
  println(visitedCountries.get(0))

  visitedCountries + "China"
  println(visitedCountries.size)

  val sizedArray = Array(10) { "" }
  val emptyArray = emptyArray<String>()

  val intArrays = intArrayOf(1, 2, 3, 4)
  println(intArrays)

  // creates 10 elements of an array with value 0
  val intArrays2 = IntArray(10)
  println(intArrays2)

  // other methods
  println(visitedCountries.last())
  println(visitedCountries.first())
  println(visitedCountries.lastIndex)

  // ways to check elements in arrays
  val currentCountry = "Brazil"
  println(visitedCountries.contains(currentCountry))

  val hasVisitedBrazil = currentCountry in visitedCountries
  val hasNotVisitedBrazil = currentCountry !in visitedCountries

  println(hasVisitedBrazil)
  println(hasNotVisitedBrazil)
  
  // Lists
  // - Lists are powered by arrays
  // - Index data access - O(1)
  // - Iteration - O(n)
  // but list has a few specialties:
  //    - Changeable size
  //    - Spread out of memory
  //    - Remove O(n) - Shifts the list
  //    - Add O(1) - Appends at end
  val visitedCountriesList = listOf<String>(
      "Brazil", "Japan", "Canada", "USA", "Spain"
  )

  println(visitedCountriesList)

  val visitedCountriesMutableList = mutableListOf<String>(
      "Brazil", "Japan", "Canada", "USA", "Spain"
  )

  println(visitedCountriesMutableList)

  // appending element at the end of the list
  visitedCountriesMutableList.add("Germany")

  // appending element at any position
  visitedCountriesMutableList.add(1, "Greece")

  println(visitedCountriesMutableList)

  visitedCountriesMutableList.addAll(3, listOf("Australia, Austria"))

  // check if an element is inside the list
  val hasBeenToJapan = "Japan" in visitedCountriesMutableList
  println(hasBeenToJapan)

  visitedCountriesMutableList.removeAll(listOf("Australia, Austria"))
  visitedCountriesMutableList.removeAt(0)
  visitedCountriesMutableList.remove("Brazil")

  println(visitedCountriesMutableList)

  visitedCountriesMutableList[1] = "Israel"

  println(visitedCountriesMutableList)

  val combineLists = visitedCountries + visitedCountriesMutableList
  val emptyList = emptyList<String>()

  println(combineLists)
  println(emptyList)

  visitedCountriesMutableList.clear()
  println(visitedCountriesMutableList)

  // Store Data in Collections Challenge
  val challengeArray = arrayListOf<String>(
      "game1", "game2", "game3", "game4", "game5"
  )

  challengeArray[2] = "change game"
  println(challengeArray[1])

  val challengeMutableList = challengeArray.toMutableList()

  challengeMutableList.add("game6")
  challengeMutableList.removeAt(0)

  println(challengeMutableList)
  println("game1" in challengeMutableList)
  
  // Last challenge of the section
  val newArray = mutableListOf<String>(
      "Something", "else"
  )

  newArray[0] = "Anything"

  newArray.add("new element")

  println(newArray)

  newArray.remove("else")

  println(newArray)

  println("else" in newArray)
}
