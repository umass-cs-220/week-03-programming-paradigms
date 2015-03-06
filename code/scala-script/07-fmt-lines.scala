#! /bin/sh
exec scala "$0" "$@"
!#

/*
 A simple script demonstrating some useful aspects of Scala.

 It reads in a file and prints the length of each line on the
 left in a formated fashion:

 10 | #! /bin/sh
 20 | exec scala "$0" "$@"
  2 | !#
 ...
 */

// Source is a utility class that makes it easy to read in files:
import scala.io.Source

// A function to return the width of the length of a String.
def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {
  // Get the lines of a file as an immutable List
  val lines = Source.fromFile(args(0)).getLines().toList

  // Find the longest line using "reduceLeft"
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )

  // Get the maximum width of the length of the longest line:
  val maxWidth = widthOfLength(longestLine)

  // Iterate over each line printing the formatted output:
  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding   = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}
else
  Console.err.println("Please enter filename")

// Note, this is not totally functional. Why?

// How could we make this purely functional?
