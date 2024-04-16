 object PatternRelated8 {
    def main(args : Array[String]): Unit ={
      for(i<-5 to 1 by -1){
        var num=i
        for(j<-1 to i){
          print(num+" ")
          num=num-1
        }
        println()
      }
    }
  }

