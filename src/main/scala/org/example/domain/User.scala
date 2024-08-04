package org.example.domain

import org.example.domain.Privileges.Privilege

class User(val userId: Long, val firstName: String, val lastName: String, val age: Int, val privileges: List[Privilege]) {


  override def toString = s"User($userId, $firstName, $lastName, $age, $privileges)"


  private def canEqual(other: Any): Boolean = other.isInstanceOf[User]

  override def equals(other: Any): Boolean = other match {
    case that: User =>
      that.canEqual(this) &&
        userId == that.userId &&
        firstName == that.firstName &&
        lastName == that.lastName &&
        age == that.age &&
        privileges == that.privileges
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(userId, firstName, lastName, age, privileges)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

