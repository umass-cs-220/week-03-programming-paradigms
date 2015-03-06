package cs220.db

object Database {
  private var db = Map[String, String]()

  def add(key: String, value: String): String = {
    db = db + (key -> value)
    value
  }

  def get(key: String): String = db(key)

  def remove(key: String): String = {
    val value = db(key)
    db = db - key
    value
  }  
}
