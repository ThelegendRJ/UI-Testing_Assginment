package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  "email" should "be invalid as it does not contains recipient name" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("@gmail.com"))
  }

  "email" should "be invalid as it does not contains @ symbol" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("ronakgmail.com"))
  }

  "email" should "be invalid as it does not contains domain name" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("ronak@.com"))
  }

  "email" should "be invalid as it does not contains .(com,net,org)" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("ronak@gmail.in"))
  }

  "email" should "be valid" in {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("ronak@gmail.com"))
  }
}
