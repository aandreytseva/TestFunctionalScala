package org.example

import org.example.domain.Privileges._
import org.example.domain.User
import org.example.service.UserServiceImpl

object Main extends App {

  println("Hello, Scala Developer!")
  val userService = new UserServiceImpl()

  val user1 = new User(1L, "Alice", "Smith", 30, List(CREATE, READ))
  val user2 = new User(2L, "Bob", "Johnson", 25, List(UPDATE, READ))
  val user3 = new User(3L, "Carol", "Williams", 35, List(DELETE, READ))
  val user4 = new User(4L, "Dave", "Brown", 28, List(UPDATE, READ))

  val users: List[User] = List(user1, user2, user3, user4)

  println("Reverse sorted first names : " + userService.getFirstNamesReverseSorted(users))
  println("All distinct privileges: " + userService.getAllDistinctPrivileges(users))
  println("Any user with age higher than 30: " + userService.getUserWithAgeHigherThan(users, 30))
  println("Average age of users: " + userService.getAverageAgeForUsers(users))
}
