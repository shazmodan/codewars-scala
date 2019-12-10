package example

object Kata {
  def noSpace(s: String): String = s.replaceAll(" ", "")
  def last(s: String): Array[String] = s.split(" ").sortWith(_.last < _.last)

  def rowSumOddNumbers(n: Long): Long = {
    val numbersToGenerate = List.range(1, n+1).sum
    List.range(1, numbersToGenerate * 2, 2).takeRight(n.toInt).sum
  }

  def count(string: String): Map[Char, Int] =
    string
      .toList
      .foldLeft(Map.empty[Char, Int])(
        (result: Map[Char, Int], x: Char) =>
          result + (x -> (result.getOrElse(x, 0) + 1))
      )

  def breakChocolate(n: Int, m: Int) = {
    // your code here
  }
}
