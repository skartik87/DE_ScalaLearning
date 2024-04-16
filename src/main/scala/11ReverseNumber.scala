object ReverseNumber {
  def main(args : Array[String]) : Unit={
    var a=311
    var b=a
    var rem=0
    var rev=0
    while(a!=0){
      rem=a%10
      rev=rev*10+rem
      a=a/10
    }
    println("Reverse of "+b+" is: "+rev)
  }
}
