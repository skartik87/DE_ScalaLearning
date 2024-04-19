object DynamicArray {
  def main(args: Array[String]): Unit={
    //First decide size of the array
    println("enter the size of the array")
    val size= scala.io.StdIn.readInt()
    //Create array with new keyword. Mention type of array and size
    val arr= new Array[Int](size) //If we type size as 10, then 10 size array will get created
    //To take array elements from user
    for(i<-0 until arr.length){
      println("enter the element at ", i)
      arr(i)= scala.io.StdIn.readInt()
    }
    for(i<-0 until arr.length){
      println(arr(i))
    }
  }
}
