object highestarray {
  def main(args : Array[String]): Unit = {
    var a = Array(10, 20, 30, 40, 50, 60)
    var maxnum=0
    for (i <- 0 until a.length) {
      maxnum=a(i)
      for (j <- 0 until a.length) {
        if(a(j)>maxnum){
          maxnum=a(j)
        }
      }
      }
    println("MAX NUMBER IN ARRAY USING LOOP", maxnum)
    println("MAX NUMBER IN ARRAY USING FUNCTION", a.max)
    }
  }