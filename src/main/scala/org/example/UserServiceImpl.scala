package org.example

import org.example.Privileges.Privilege

class UserServiceImpl extends UserService {
  override def getFirstNamesReverseSorted(users: List[User]): List[String] =
    users.map(_.firstName)
      .sorted(Ordering[String].reverse)

  override def getAllDistinctPrivileges(users: List[User]): List[Privilege] =
    users.flatMap(_.privileges)
      .distinct

  override def getUserWithAgeHigherThan(users: List[User], age: Int): Option[User] =
    users.find(_.age > age)

  override def getAverageAgeForUsers(users: List[User]): Double = {
    if (!users.isEmpty)
      users.map(_.age).sum.toDouble / users.size
    else -1
  }
}
