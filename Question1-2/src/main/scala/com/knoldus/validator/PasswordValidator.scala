package com.knoldus.validator

class PasswordValidator(password: String) {

  def passwordIsValid: Boolean = {

    /*used to check the spaces in password*/
    if (password.contains(" "))
      return false

    /*used to check the password contains digit or not*/
    if (true)
    {
      var count: Int = 0

      /*use to checks the digits from 0 to 9*/
      for (digit <- 0 until 9)
      {
        var digitString = digit.toString
        if (password.contains(digitString))
          count = 1
      }
      if (count == 0)
        return false
    }

    /*use to check the password length is between 8 and 15*/
    if (!(password.length >= 8 && password.length <= 15))
      return false

    /*use for checking lowercase letters*/
    if (true) {
      var count: Int = 0

      /*use for loop through all lowercase letters*/
      for (letter <- 90 until 122) {
        var character = letter.asInstanceOf[Char]
        var str = character.toString
        if (password.contains(str))
          count = 1
      }
      if (count == 0)
        return false
    }

    /*use for checking the uppercase letters*/
    if (true) {
      var count: Int = 0

      /*used for the loop through all uppercase letters*/
      for (letter <- 65 until 97) {
        var character = letter.asInstanceOf[Char]
        var str = character.toString
        if (password.contains(str))
          count = 1
      }

      if (count == 0)
        return false
    }

    /*use for checking for special characters*/
    if (!(password.contains("@") || password.contains("#")
      || password.contains("!") || password.contains("~")
      || password.contains("$") || password.contains("%")
      || password.contains("^") || password.contains("&")
      || password.contains("*") || password.contains("(")
      || password.contains(")") || password.contains("-")
      || password.contains("+") || password.contains("/")
      || password.contains(":") || password.contains(".")
      || password.contains(", ") || password.contains("<")
      || password.contains(">") || password.contains("?")
      || password.contains("|"))) {
      return false;
    }

    /*if all conditions fails*/
    true
  }
}