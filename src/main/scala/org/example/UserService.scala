package org.example

import org.example.Privileges.Privilege

trait UserService {
  def getFirstNamesReverseSorted(users: List[User]): List[String]
  def getAllDistinctPrivileges(users: List[User]): List[Privilege]
  def getUserWithAgeHigherThan(users: List[User], age: Int): Option[User]
  def getAverageAgeForUsers(users: List[User]): Double
}
