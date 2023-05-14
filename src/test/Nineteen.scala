package test

object Nineteen {
  var inc=(x:Int)=>x+1
  var x=inc(7)-1
  var mul=(x:Int,y:Int)=>x*y

  def main(args: Array[String]): Unit = {
    println(inc(5))
    println(x)
    print(mul(3,4))
  }
}
