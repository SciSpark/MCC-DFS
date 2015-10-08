import org.apache.spark.rdd.RDD

class ParallelDFS {

  /**
   * Basic DFS implementation using an edgeList of (Int, Int).
   * Note that for the sake of the exercise do not use for-loops.
   *
   * @param edgeList
   */
  def ParallelDFS(edgeList : Array[(Int, Int)]): Unit ={

  }

  /**
   * should be a line for line copy of the above code.
   * @param edgeList
   */
  def ParallelDFSRDDSimple(edgeList : RDD[(Int, Int)]) : Unit = {

  }

  /**
   * This should be a port of the previous function. Instead of dealing with
   * Int's as vertex identifies, we now deal with String, Double.
   * The String is an integer that represents the Frame ID.
   *
   * As before only use maps, reduces, and other functional constructs.
   * In functional programming try to stay away from for loops.
   * @param edgeList
   */
  def ParallelDFSArray(edgeList : Array[((String, Double), (String, Double))]): Unit = {

  }

  /**
   * This code should be a direct line for line copy of the previous function.
   * @param edgeList
   */
  def ParallelDFSRDD(edgeList : RDD[((String, Double), (String, Double))]) : Unit = {

  }

}
