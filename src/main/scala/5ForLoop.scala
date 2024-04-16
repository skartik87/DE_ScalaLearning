object ForLoop {
def main(args : Array[String]): Unit = {
  println("Output of range operator 'to': ")
  for(i<-1 to 4){
    print(i+" ")
  }
  println("\nOutput of range operator 'to' with step: ")
  for(i<-1 to 4 by 2){
    print(i+" ")
  }
  println("\nOutput of range operator 'until': ")
  for(i<-1 until 4){
    print(i+" ")
  }
  println("\nOutput of range operator 'until' with step: ")
  for(i<-1 until 4 by 2){
    print(i+" ")
  }
  println("\nOutput of reverse for loop: ")
  for(i<-4 to 1 by -1){
    print(i+" ")
  }
  println("\nOutput of for loop with if else: ")
  for(i<-1 to 4){
    if(i%2==0){
      print("even", i+" ")
    }
  }
}
}
