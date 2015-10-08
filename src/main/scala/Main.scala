import scala.io.Source
import java.io.File
object Main {

  def ReadEdgeList(fileName : String): Array[((String, Int), (String, Int))] ={
    val file = Source.fromFile(new File(fileName)).mkString.split("\n")
    val firstLine = file(0)
    val secondLine = file(1)

    /**
     * Code to parse the vertex list
     * Code to parse the edge list
     */
    println(file)
    null
  }

  def main (args: Array[String]) {
    ReadEdgeList("List.txt")
  }
}
