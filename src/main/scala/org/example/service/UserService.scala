package org.example.service

import org.example.domain.Privileges.Privilege
import org.example.domain.User

trait UserService {
  def getFirstNamesReverseSorted(users: List[User]): List[String]
  def getAllDistinctPrivileges(users: List[User]): List[Privilege]
  def getUserWithAgeHigherThan(users: List[User], age: Int): Option[User]
  def getAverageAgeForUsers(users: List[User]): Double
}
