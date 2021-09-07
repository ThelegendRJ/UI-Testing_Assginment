package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val lokeshUser: User = User("Lokesh","Kumar",21,"knoldus","lokesh.kumar@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(lokeshUser)) thenReturn(true)
    val result = userImpl.createUser(lokeshUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(lokeshUser)) thenReturn(false)
    val result = userImpl.createUser(lokeshUser)
    assert(result.isEmpty)
  }

}
