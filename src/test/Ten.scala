package test
object Ten {
  def main(args: Array[String]): Unit = {
    var b=new Array[Int](10)
    b(0)=3
    for(i <- 1 to b.length-1){
      b(i)=b(i-1)*2+1
    }
    for(i <- 0 to b.length-1){
      print(b(i)+"  ")
      }
    for(i <- 0 to b.length-1){
      if(i%2==0){
        val d=b(i)
        b(i)=b(i+1)
        b(i+1)=d
      }
    }
    println()
    for(i <- 0 to b.length-1){
      print(b(i)+"  ")
    }
  }
}
