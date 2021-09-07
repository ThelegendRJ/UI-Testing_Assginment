package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {
  "password" should "be invalid as it contains space" in {
    val password = new PasswordValidator("Ronak2@ Kumar")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any digit" in {
    val password = new PasswordValidator("Ronak#Kumar")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is less than 8" in {
    val password = new PasswordValidator("Ronak2$")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is more than 15" in {
    val password = new PasswordValidator("Ronak@Janawa1999")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any lowercase letter" in {
    val password = new PasswordValidator("RONAK@JANAWA2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any uppercase letter" in {
    val password = new PasswordValidator("ronak@janawa2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any special character" in {
    val password = new PasswordValidator("RonakJanawa2")
    assert(!password.passwordIsValid)
  }

  "password" should "be valid" in {
    val password = new PasswordValidator("Ronak@Janawa11")
    assert(password.passwordIsValid)
  }
}