object FibonacciSeries {
  def main(args : Array[String]) : Unit ={
    var a=0
    print(a+ " ")
    var b=1
    print(b+ " ")
    for(i<-1 to 10){
      var c=a+b
      print(c+ " ")
      a=b
      b=c
    }
  }
}
