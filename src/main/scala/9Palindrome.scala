object Palindrome {
  def main(args:Array[String]): Unit={
    var a=333
    var b=a
    var rev=0
    var rem=0
    while(a!=0){
      rem=a%10
      rev=rev*10+rem
      a=a/10
    }
    if (rev==b){
      println("Palindrome Number")
    }
    else{
      println("Not Palindrome Number")
    }
  }
}
