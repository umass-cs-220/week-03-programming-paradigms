package cs220

import cs220.db.Database

object Main {
  def addStuff() {
    Database.add("John", "23456789")
    Database.add("Mia", "98765432")
  }

  def getStuff() {
    println(Database.get("John"))
    println(Database.get("Mia"))
  }

  def main(args: Array[String]) = {
    addStuff
    getStuff
  }
}
