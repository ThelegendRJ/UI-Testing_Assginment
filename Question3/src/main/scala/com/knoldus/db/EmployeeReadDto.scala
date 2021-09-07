package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val lokeshEmployee: Employee = Employee("Lokesh","Kumar",21,15000,"Intern","knoldus","lokesh.kumar@knoldus.com")
  val rahulEmployee: Employee = Employee("Rahul","Gupta",28,15000,"Software Engineer","Philips","rahul.gupta@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Lokesh" -> lokeshEmployee, "Rahul" -> rahulEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
