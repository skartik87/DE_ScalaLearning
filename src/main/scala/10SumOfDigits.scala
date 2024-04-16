object sumofdigits {
  def main(args: Array[String]): Unit={
    var a=311
    var rem=0
    var sum=0
    while(a!=0){
      rem=a%10
      sum=sum+rem
      a=a/10
    }
    println("The sum of digits is: ",sum)
  }
}
