package cs220.db

import scala.collection.immutable.{HashMap, TreeMap}

trait DatabaseTrait {
  def add(key: String, value: String): String
  def get(key: String): String
  def remove(key: String): String
}

class MapDatabase extends DatabaseTrait {
  var db = HashMap[String, String]()

  override def add(key: String, value: String): String = {
    db = db + (key -> value)
    value
  }

  override def get(key: String): String = db(key)

  override def remove(key: String): String = {
    val value = db(key)
    db = db - key
    value
  }
}

class TreeDatabase extends DatabaseTrait {
  var db = TreeMap[String, String]()

  override def add(key: String, value: String): String = {
    db = db + (key -> value)
    value
  }

  override def get(key: String): String = db(key)

  override def remove(key: String): String = {
    val value = db(key)
    db = db - key
    value
  }  
}

object Database extends MapDatabase
