package cs220

import cs220.ChecksumAccumulator.calculate

object Main {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
