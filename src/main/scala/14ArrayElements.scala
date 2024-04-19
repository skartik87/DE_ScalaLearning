object ArrayElements {
def main(args : Array[String]): Unit={
  var arr=Array(1,2,3,4,5)
  println(arr) //prints the address of first element
    for(i<-0 until arr.length){
      //arr.length gives the length of an array. We start from index 0 and end at arr.length -1, Hence use until
      println(arr(i))
    }
}
}
