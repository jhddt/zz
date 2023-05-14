package test

object FourDemo {
  def main(args: Array[String]): Unit = {
        val i=0
        val j=0
        for(i<- 1 to 9){
          print("\n")
          for(j<- 1 to i){
            print(i+"x"+j+"="+i*j+"\t")
          }
        }
  }
}
