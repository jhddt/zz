package test

object Eighteen {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      println(i+"的阶乘：="+factorial(i))
    }
    def factorial(n: Int):Int={
      if(n<=1){
        1
      }else{
        n*factorial(n-1)
      }
    }
  }
}
