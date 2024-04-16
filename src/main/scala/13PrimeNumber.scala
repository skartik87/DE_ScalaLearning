object PrimeNumber {
def main(args : Array[String]) : Unit={
  var a = 5
  var count = 0
  for(i<-1 to 21){
    if(a%i==0){
      count=count+1
    }
  }
  if(count==2){
    println("prime number")
  }
  else{
    println("Not a prime number")
  }
  }
}
